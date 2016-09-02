/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui;

import com.archimatetool.editor.ArchiPlugin;


/**
 * Image Factory for this application
 * 
 * @author Phillip Beauvoir
 */
public interface IArchiImages {
    
    ImageFactory ImageFactory = new ImageFactory(ArchiPlugin.INSTANCE);

    String IMGPATH = "img/"; //$NON-NLS-1$
    
    String ARCHIMATE_IMGPATH = IMGPATH + "archimate/"; //$NON-NLS-1$
    
    String ICON_APP_16 = IMGPATH + "app-16.png"; //$NON-NLS-1$
    String ICON_APP_32 = IMGPATH + "app-32.png"; //$NON-NLS-1$
    String ICON_APP_48 = IMGPATH + "app-48.png"; //$NON-NLS-1$
    String ICON_APP_64 = IMGPATH + "app-64.png"; //$NON-NLS-1$
    String ICON_APP_128 = IMGPATH + "app-128.png"; //$NON-NLS-1$
    
    String BROWN_PAPER_BACKGROUND = IMGPATH + "br_paper.jpg"; //$NON-NLS-1$
    String CORK_BACKGROUND = IMGPATH + "cork.jpg"; //$NON-NLS-1$
    String DEFAULT_MODEL_THUMB = IMGPATH + "default_model_thumb.png"; //$NON-NLS-1$
    
    // ECLIPSE IMAGES
    String ECLIPSE_IMAGE_PROPERTIES_VIEW_ICON = IMGPATH + "prop_ps.gif"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_OUTLINE_VIEW_ICON = IMGPATH + "outline_co.gif"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_NEW_WIZARD = IMGPATH + "new_wiz.png"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_IMPORT_PREF_WIZARD = IMGPATH + "importpref_wiz.png";  //$NON-NLS-1$
    String ECLIPSE_IMAGE_EXPORT_DIR_WIZARD = IMGPATH + "exportdir_wiz.png"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_FILE = IMGPATH + "file_obj.gif"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_FOLDER = IMGPATH + "fldr_obj.gif"; //$NON-NLS-1$
    
    String MENU_ARROW = IMGPATH + "menu-arrow.png"; //$NON-NLS-1$
    
    String ZOOM_NORMAL = IMGPATH + "zoom_normal.gif"; //$NON-NLS-1$
    
    // Plain
    String ICON_ACTOR_16 = ARCHIMATE_IMGPATH + "actor-16.png"; //$NON-NLS-1$
    String ICON_INTERFACE_REQUIRED_16 = ARCHIMATE_IMGPATH + "interface-required-16.png"; //$NON-NLS-1$

    // Elements
    String ICON_APPLICATION_COLLABORATION_16 = ARCHIMATE_IMGPATH + "application-collaboration-16.png"; //$NON-NLS-1$
    String ICON_APPLICATION_COMPONENT_16 = ARCHIMATE_IMGPATH + "application-component-16.png"; //$NON-NLS-1$
    String ICON_APPLICATION_FUNCTION_16 = ARCHIMATE_IMGPATH + "application-function-16.png"; //$NON-NLS-1$
    String ICON_APPLICATION_INTERACTION_16 = ARCHIMATE_IMGPATH + "application-interaction-16.png"; //$NON-NLS-1$
    String ICON_APPLICATION_INTERFACE_16 = ARCHIMATE_IMGPATH + "application-interface-16.png"; //$NON-NLS-1$
    String ICON_APPLICATION_SERVICE_16 = ARCHIMATE_IMGPATH + "application-service-16.png"; //$NON-NLS-1$
    String ICON_ARTIFACT_16 = ARCHIMATE_IMGPATH + "artifact-16.png"; //$NON-NLS-1$
    String ICON_ASSESSMENT_16 = ARCHIMATE_IMGPATH + "assessment-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_ACTOR_16 = ARCHIMATE_IMGPATH + "business-actor-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_COLLABORATION_16 = ARCHIMATE_IMGPATH + "business-collaboration-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_EVENT_16 = ARCHIMATE_IMGPATH + "business-event-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_FUNCTION_16 = ARCHIMATE_IMGPATH + "business-function-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_INTERACTION_16 = ARCHIMATE_IMGPATH + "business-interaction-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_INTERFACE_16 = ARCHIMATE_IMGPATH + "business-interface-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_OBJECT_16 = ARCHIMATE_IMGPATH + "business-object-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_PROCESS_16 = ARCHIMATE_IMGPATH + "business-process-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_ROLE_16 = ARCHIMATE_IMGPATH + "business-role-16.png"; //$NON-NLS-1$
    String ICON_BUSINESS_SERVICE_16 = ARCHIMATE_IMGPATH + "business-service-16.png"; //$NON-NLS-1$
    String ICON_COMMUNICATION_NETWORK_16 = ARCHIMATE_IMGPATH + "communication-network-16.png"; //$NON-NLS-1$
    String ICON_CONSTRAINT_16 = ARCHIMATE_IMGPATH + "constraint-16.png"; //$NON-NLS-1$
    String ICON_CONTRACT_16 = ARCHIMATE_IMGPATH + "contract-16.png"; //$NON-NLS-1$
    String ICON_DATA_OBJECT_16 = ARCHIMATE_IMGPATH + "data-object-16.png"; //$NON-NLS-1$
    String ICON_DELIVERABLE_16 = ARCHIMATE_IMGPATH + "deliverable-16.png"; //$NON-NLS-1$
    String ICON_DEVICE_16 = ARCHIMATE_IMGPATH + "device-16.png"; //$NON-NLS-1$
    String ICON_DRIVER_16 = ARCHIMATE_IMGPATH + "driver-16.png"; //$NON-NLS-1$
    String ICON_GAP_16 = ARCHIMATE_IMGPATH + "gap-16.png"; //$NON-NLS-1$
    String ICON_GOAL_16 = ARCHIMATE_IMGPATH + "goal-16.png"; //$NON-NLS-1$
    String ICON_LOCATION_16 = ARCHIMATE_IMGPATH + "location-16.png"; //$NON-NLS-1$
    String ICON_MEANING_16 = ARCHIMATE_IMGPATH + "meaning-16.png"; //$NON-NLS-1$
    String ICON_NODE_16 = ARCHIMATE_IMGPATH + "node-16.png"; //$NON-NLS-1$
    String ICON_OUTCOME_16 = ARCHIMATE_IMGPATH + "outcome-16.png"; //$NON-NLS-1$
    String ICON_PATH_16 = ARCHIMATE_IMGPATH + "path-16.png"; //$NON-NLS-1$
    String ICON_PLATEAU_16 = ARCHIMATE_IMGPATH + "plateau-16.png"; //$NON-NLS-1$
    String ICON_PRINCIPLE_16 = ARCHIMATE_IMGPATH + "principle-16.png"; //$NON-NLS-1$
    String ICON_PRODUCT_16 = ARCHIMATE_IMGPATH + "product-16.png"; //$NON-NLS-1$
    String ICON_REPRESENTATION_16 = ARCHIMATE_IMGPATH + "representation-16.png"; //$NON-NLS-1$
    String ICON_RESOURCE_16 = ARCHIMATE_IMGPATH + "resource-16.png"; //$NON-NLS-1$
    String ICON_REQUIREMENT_16 = ARCHIMATE_IMGPATH + "requirement-16.png"; //$NON-NLS-1$
    String ICON_STAKEHOLDER_16 = ARCHIMATE_IMGPATH + "stakeholder-16.png"; //$NON-NLS-1$
    String ICON_SYSTEM_SOFTWARE_16 = ARCHIMATE_IMGPATH + "system-software-16.png"; //$NON-NLS-1$
    String ICON_TECHNOLOGY_FUNCTION_16 = ARCHIMATE_IMGPATH + "technology-function-16.png"; //$NON-NLS-1$
    String ICON_TECHNOLOGY_INTERFACE_16 = ARCHIMATE_IMGPATH + "technology-interface-16.png"; //$NON-NLS-1$
    String ICON_TECHNOLOGY_SERVICE_16 = ARCHIMATE_IMGPATH + "technology-service-16.png"; //$NON-NLS-1$
    String ICON_VALUE_16 = ARCHIMATE_IMGPATH + "value-16.png"; //$NON-NLS-1$
    String ICON_WORKPACKAGE_16 = ARCHIMATE_IMGPATH + "workpackage-16.png"; //$NON-NLS-1$
    
    // Relations
    String ICON_ACESS_RELATION_16 = ARCHIMATE_IMGPATH + "access-16.png"; //$NON-NLS-1$
    String ICON_AGGREGATION_RELATION_16 = ARCHIMATE_IMGPATH + "aggregation-16.png"; //$NON-NLS-1$
    String ICON_ASSIGNMENT_RELATION_16 = ARCHIMATE_IMGPATH + "assignment-16.png"; //$NON-NLS-1$
    String ICON_ASSOCIATION_RELATION_16 = ARCHIMATE_IMGPATH + "association-16.png"; //$NON-NLS-1$
    String ICON_COMPOSITION_RELATION_16 = ARCHIMATE_IMGPATH + "composition-16.png"; //$NON-NLS-1$
    String ICON_FLOW_RELATION_16 = ARCHIMATE_IMGPATH + "flow-16.png"; //$NON-NLS-1$
    String ICON_INFLUENCE_RELATION_16 = ARCHIMATE_IMGPATH + "influence-16.png"; //$NON-NLS-1$
    String ICON_REALIZATION_RELATION_16 = ARCHIMATE_IMGPATH + "realization-16.png"; //$NON-NLS-1$
    String ICON_SPECIALIZATION_RELATION_16 = ARCHIMATE_IMGPATH + "specialization-16.png"; //$NON-NLS-1$
    String ICON_TRIGGERING_RELATION_16 = ARCHIMATE_IMGPATH + "triggering-16.png"; //$NON-NLS-1$
    String ICON_SERVING_RELATION_16 = ARCHIMATE_IMGPATH + "serving-16.png"; //$NON-NLS-1$
    
    // Junctions
    String ICON_AND_JUNCTION_16 = ARCHIMATE_IMGPATH + "junction-and-16.png"; //$NON-NLS-1$
    String ICON_OR_JUNCTION_16 = ARCHIMATE_IMGPATH + "junction-or-16.png"; //$NON-NLS-1$
    

    
    // Other
    String ICON_ALIGN_TEXT_LEFT = IMGPATH + "alignleft.gif"; //$NON-NLS-1$
    String ICON_ALIGN_TEXT_CENTER = IMGPATH + "aligncenter.gif"; //$NON-NLS-1$
    String ICON_ALIGN_TEXT_RIGHT = IMGPATH + "alignright.gif"; //$NON-NLS-1$
    String ICON_ASPECT_RATIO = IMGPATH + "aspect-ratio.png"; //$NON-NLS-1$
    String ICON_CANCEL_SEARCH_16 = IMGPATH + "cancelsearch-16.png"; //$NON-NLS-1$
    String ICON_COG = IMGPATH + "cog.png"; //$NON-NLS-1$
    String ICON_COLLAPSEALL_16 = IMGPATH + "collapseall.png"; //$NON-NLS-1$
    String ICON_DIAGRAM_16 = IMGPATH + "diagram-16.png"; //$NON-NLS-1$
    String ICON_DEFAULT_SIZE = IMGPATH + "default-size.png"; //$NON-NLS-1$
    String ICON_DERIVED_16 = IMGPATH + "derived-16.png"; //$NON-NLS-1$
    String ICON_DERIVED_SM_16 = IMGPATH + "derived-sm-16.png"; //$NON-NLS-1$
    String ICON_EXPANDALL_16 = IMGPATH + "expandall.png"; //$NON-NLS-1$
    String ICON_FILTER_16 = IMGPATH + "filter.gif"; //$NON-NLS-1$
    String ICON_FORMAT_PAINTER_16 = IMGPATH + "formatpainter-16.png"; //$NON-NLS-1$
    String ICON_FORMAT_PAINTER_GREY_16 = IMGPATH + "formatpainter-grey-16.png"; //$NON-NLS-1$
    String ICON_GROUP_16 = IMGPATH + "group-16.png"; //$NON-NLS-1$
    String ICON_LINKED_16 = IMGPATH + "linked.gif"; //$NON-NLS-1$
    String ICON_LANDSCAPE_16 = IMGPATH + "landscape-16.png"; //$NON-NLS-1$
    String ICON_LOCK_16 = IMGPATH + "lock-16.png"; //$NON-NLS-1$
    String ICON_MAGIC_CONNECTION_16 = IMGPATH + "magic_connection.gif"; //$NON-NLS-1$
    String ICON_MINUS = IMGPATH + "minus.png"; //$NON-NLS-1$
    String ICON_MODELS_16 = IMGPATH + "models.gif"; //$NON-NLS-1$
    String ICON_MUTIPLE = IMGPATH + "mutiple.png"; //$NON-NLS-1$
    String ICON_NAVIGATOR_16 = IMGPATH + "navigator-16.png"; //$NON-NLS-1$
    String ICON_NAVIGATOR_DOWNWARD_16 = IMGPATH + "nav-downward.gif"; //$NON-NLS-1$
    String ICON_NAVIGATOR_UPWARD_16 = IMGPATH + "nav-upward.gif"; //$NON-NLS-1$
    String ICON_NEW_FILE_16 = IMGPATH + "newfile.gif"; //$NON-NLS-1$
    String ICON_NEW_OVERLAY_16 = IMGPATH + "new_overlay.gif"; //$NON-NLS-1$
    String ICON_NOTE_16 = IMGPATH + "note-16.gif"; //$NON-NLS-1$
    String ICON_OPEN_16 = IMGPATH + "open.gif"; //$NON-NLS-1$
    String ICON_PIN_16 = IMGPATH + "pin.gif"; //$NON-NLS-1$
    String ICON_PLUS = IMGPATH + "plus.png"; //$NON-NLS-1$
    String ICON_PROPERTIES_16 = IMGPATH + "properties.gif"; //$NON-NLS-1$
    String ICON_SEARCH_16 = IMGPATH + "search-16.png"; //$NON-NLS-1$
    String ICON_SKETCH_16 = IMGPATH + "sketch-16.png"; //$NON-NLS-1$
    String ICON_SMALL_X = IMGPATH + "smallx.png"; //$NON-NLS-1$
    String ICON_SORT_16 = IMGPATH + "alphab_sort_co.gif"; //$NON-NLS-1$
    String ICON_STICKY_16 = IMGPATH + "sticky-16.png"; //$NON-NLS-1$
    String ICON_TRASH_16 = IMGPATH + "trash.gif"; //$NON-NLS-1$
    String ICON_UNLOCK_16 = IMGPATH + "unlock-16.png"; //$NON-NLS-1$
    String ICON_VIEWPOINTS_16 = IMGPATH + "viewpoints-16.png"; //$NON-NLS-1$
    String ICON_VIEWPOINT_BUSINESS_16 = IMGPATH + "vp-business-16.png"; //$NON-NLS-1$
    String ICON_VIEWPOINT_APPLICATION_16 = IMGPATH + "vp-application-16.png"; //$NON-NLS-1$
    String ICON_VIEWPOINT_TECHNOLOGY_16 = IMGPATH + "vp-technology-16.png"; //$NON-NLS-1$
    
    String ICON_CONNECTION_PLAIN_16 = IMGPATH + "connection-plain-16.png"; //$NON-NLS-1$
    String ICON_CONNECTION_ARROW_16 = IMGPATH + "connection-arrow-16.png"; //$NON-NLS-1$
    String ICON_CONNECTION_DASHED_ARROW_16 = IMGPATH + "connection-dashed-arrow-16.png"; //$NON-NLS-1$
    String ICON_CONNECTION_DOTTED_ARROW_16 = IMGPATH + "connection-dotted-arrow-16.png"; //$NON-NLS-1$
    
    String LINE_SOLID = IMGPATH + "line-solid.png"; //$NON-NLS-1$
    String LINE_DASHED = IMGPATH + "line-dashed.png"; //$NON-NLS-1$
    String LINE_DOTTED = IMGPATH + "line-dotted.png"; //$NON-NLS-1$
    
    String ARROW_SOURCE_FILL = IMGPATH + "arrow-source-fill.png"; //$NON-NLS-1$
    String ARROW_TARGET_FILL = IMGPATH + "arrow-target-fill.png"; //$NON-NLS-1$
    String ARROW_SOURCE_HOLLOW = IMGPATH + "arrow-source-hollow.png"; //$NON-NLS-1$
    String ARROW_TARGET_HOLLOW = IMGPATH + "arrow-target-hollow.png"; //$NON-NLS-1$
    String ARROW_SOURCE_LINE = IMGPATH + "arrow-source-line.png"; //$NON-NLS-1$
    String ARROW_TARGET_LINE = IMGPATH + "arrow-target-line.png"; //$NON-NLS-1$

    String CURSOR_IMG_FORMAT_PAINTER = IMGPATH + "formatpainter-cursor.gif"; //$NON-NLS-1$
    String CURSOR_IMG_FORMAT_PAINTER_GREY = IMGPATH + "formatpainter-grey-cursor.gif"; //$NON-NLS-1$
    
    String CURSOR_IMG_MAGIC_CONNECTOR = IMGPATH + "magic-connector-cursor.gif"; //$NON-NLS-1$
}
