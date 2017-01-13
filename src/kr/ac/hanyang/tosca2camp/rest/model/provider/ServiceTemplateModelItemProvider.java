/**
 */
package kr.ac.hanyang.tosca2camp.rest.model.provider;


import java.util.Collection;
import java.util.List;

import kr.ac.hanyang.tosca2camp.rest.model.ModelPackage;
import kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel;

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
 * This is the item provider adapter for a {@link kr.ac.hanyang.tosca2camp.rest.model.ServiceTemplateModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceTemplateModelItemProvider 
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
	public ServiceTemplateModelItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
			addMetaDataPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addRepositoriesPropertyDescriptor(object);
			addImportsPropertyDescriptor(object);
			addArtifactTypesPropertyDescriptor(object);
			addDataTypesPropertyDescriptor(object);
			addCapabilityTypesPropertyDescriptor(object);
			addInterfaceTypesPropertyDescriptor(object);
			addRelationshipTypesPropertyDescriptor(object);
			addNodeTypesPropertyDescriptor(object);
			addGroupTypesPropertyDescriptor(object);
			addPolicyTypesPropertyDescriptor(object);
			addTopologyTemplatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_version_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_metaData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_metaData_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__META_DATA,
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
				 getString("_UI_ServiceTemplateModel_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_description_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repositories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_repositories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_repositories_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__REPOSITORIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_imports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_imports_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__IMPORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_artifactTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_artifactTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__ARTIFACT_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_dataTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_dataTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__DATA_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capability Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapabilityTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_capabilityTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_capabilityTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__CAPABILITY_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_interfaceTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_interfaceTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__INTERFACE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relationship Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_relationshipTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_relationshipTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__RELATIONSHIP_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_nodeTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_nodeTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__NODE_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_groupTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_groupTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__GROUP_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Policy Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicyTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_policyTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_policyTypes_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__POLICY_TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Topology Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopologyTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceTemplateModel_topologyTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceTemplateModel_topologyTemplate_feature", "_UI_ServiceTemplateModel_type"),
				 ModelPackage.Literals.SERVICE_TEMPLATE_MODEL__TOPOLOGY_TEMPLATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ServiceTemplateModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceTemplateModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceTemplateModel)object).getVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceTemplateModel_type") :
			getString("_UI_ServiceTemplateModel_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceTemplateModel.class)) {
			case ModelPackage.SERVICE_TEMPLATE_MODEL__VERSION:
			case ModelPackage.SERVICE_TEMPLATE_MODEL__META_DATA:
			case ModelPackage.SERVICE_TEMPLATE_MODEL__DESCRIPTION:
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
