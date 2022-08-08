/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.propertysections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.archimatetool.editor.model.commands.FeatureCommand;
import com.archimatetool.editor.ui.ColorFactory;
import com.archimatetool.editor.ui.components.ColorChooser;
import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IDiagramModelArchimateObject;
import com.archimatetool.model.IDiagramModelObject;
import com.archimatetool.model.IFeatures;



/**
 * Property Section for an Icon's Color
 * 
 * @author Phillip Beauvoir
 */
public class IconColorSection extends AbstractECorePropertySection {
    
    private static final String HELP_ID = "com.archimatetool.help.elementPropertySection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter extends ObjectFilter {
        @Override
        public boolean isRequiredType(Object object) {
            return (object instanceof IDiagramModelArchimateObject) && shouldExposeFeature((EObject)object, IDiagramModelObject.FEATURE_ICON_COLOR);
        }

        @Override
        public Class<?> getAdaptableType() {
            return IDiagramModelArchimateObject.class;
        }
    }
    
    private ColorChooser fColorChooser;

    /**
     * Color listener
     */
    private IPropertyChangeListener colorListener = (event) -> {
        String newColor = IDiagramModelObject.FEATURE_ICON_COLOR_DEFAULT;
        
        // User changed color
        if(event.getProperty() == ColorChooser.PROP_COLORCHANGE) {
            RGB rgb = fColorChooser.getColorValue();
            newColor = ColorFactory.convertRGBToString(rgb);
        }
            
        CompoundCommand result = new CompoundCommand();
        
        for(EObject object : getEObjects()) {
            if(isAlive(object)) {
                Command cmd = new FeatureCommand(Messages.IconColorSection_0, (IFeatures)object,
                        IDiagramModelObject.FEATURE_ICON_COLOR, newColor, IDiagramModelObject.FEATURE_ICON_COLOR_DEFAULT);
                if(cmd.canExecute()) {
                    result.add(cmd);
                }
            }
        }
        
        executeCommand(result.unwrap());
    };
    
    @Override
    protected void createControls(Composite parent) {
        createColorControl(parent);
        
        // Help ID
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
    }
    
    private void createColorControl(Composite parent) {
        createLabel(parent, Messages.IconColorSection_1, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        fColorChooser = new ColorChooser(parent, getWidgetFactory());
        fColorChooser.setDoShowPreferencesMenuItem(false);
        fColorChooser.addListener(colorListener);
    }
    
    @Override
    protected void notifyChanged(Notification msg) {
        if(msg.getNotifier() == getFirstSelectedObject()) {
            Object feature = msg.getFeature();
            if(feature == IArchimatePackage.Literals.LOCKABLE__LOCKED) {
                update();
            }
        }
        
        // Notifier is the Feature
        if(isFeatureNotification(msg, IDiagramModelObject.FEATURE_ICON_COLOR)) {
            update();
        }
    }

    @Override
    protected void update() {
        IDiagramModelObject lastSelected = (IDiagramModelObject)getFirstSelectedObject();
        
        String colorValue = lastSelected.getIconColor();
        RGB rgb = ColorFactory.convertStringToRGB(colorValue);
        if(rgb == null) {
            rgb = new RGB(0, 0, 0);
        }
        
        fColorChooser.setColorValue(rgb);
        fColorChooser.setIsDefaultColor(IDiagramModelObject.FEATURE_ICON_COLOR_DEFAULT.equals(colorValue));
        fColorChooser.setEnabled(!isLocked(lastSelected));
    }
    
    @Override
    protected IObjectFilter getFilter() {
        return new Filter();
    }
    
    @Override
    public void dispose() {
        super.dispose();
        
        if(fColorChooser != null) {
            fColorChooser.removeListener(colorListener);
        }
    }
}
