/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.provider;


import java.util.Collection;
import java.util.List;

import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link kr.ac.hanyang.tosca2camp.rest.model.NodeTemplateModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeTemplateModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTemplateModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addDirectivesPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
			addRequirementsPropertyDescriptor(object);
			addCapabilitiesPropertyDescriptor(object);
			addInterfacesPropertyDescriptor(object);
			addArtifactsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_name_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_type_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectivesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_directives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_directives_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__DIRECTIVES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_description_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_properties_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__PROPERTIES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_attributes_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__ATTRIBUTES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_requirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_requirements_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__REQUIREMENTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_capabilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_capabilities_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__CAPABILITIES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_interfaces_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__INTERFACES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifacts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeTemplateModel_artifacts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeTemplateModel_artifacts_feature", "_UI_NodeTemplateModel_type"),
				 ModelPackage.Literals.NODE_TEMPLATE_MODEL__ARTIFACTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns NodeTemplateModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeTemplateModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NodeTemplateModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NodeTemplateModel_type") :
			getString("_UI_NodeTemplateModel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NodeTemplateModel.class)) {
			case ModelPackage.NODE_TEMPLATE_MODEL__NAME:
			case ModelPackage.NODE_TEMPLATE_MODEL__TYPE:
			case ModelPackage.NODE_TEMPLATE_MODEL__DIRECTIVES:
			case ModelPackage.NODE_TEMPLATE_MODEL__DESCRIPTION:
			case ModelPackage.NODE_TEMPLATE_MODEL__PROPERTIES:
			case ModelPackage.NODE_TEMPLATE_MODEL__ATTRIBUTES:
			case ModelPackage.NODE_TEMPLATE_MODEL__REQUIREMENTS:
			case ModelPackage.NODE_TEMPLATE_MODEL__CAPABILITIES:
			case ModelPackage.NODE_TEMPLATE_MODEL__INTERFACES:
			case ModelPackage.NODE_TEMPLATE_MODEL__ARTIFACTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TOSCAEditPlugin.INSTANCE;
	}

}
