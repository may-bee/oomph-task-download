/**
 */
package com.github.maybee.oomph.task.download.provider;

import org.eclipse.oomph.setup.provider.SetupTaskItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.github.maybee.oomph.task.download.downloadPackage;
import com.github.maybee.oomph.task.download.downloadTask;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link com.github.maybee.oomph.task.download.downloadTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class downloadTaskItemProvider extends SetupTaskItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public downloadTaskItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addResourceLocationPropertyDescriptor(object);
      addIsURLPropertyDescriptor(object);
      addConnectionTimeoutPropertyDescriptor(object);
      addReadTimeoutPropertyDescriptor(object);
      addDestinationPathPropertyDescriptor(object);
      addDestinationFilePropertyDescriptor(object);
      addPriorityPropertyDescriptor(object);
      addEstimatedSizePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Resource Location feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addResourceLocationPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_resourceLocation_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_resourceLocation_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__RESOURCE_LOCATION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Is URL feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIsURLPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_isURL_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_isURL_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__IS_URL, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Connection Timeout feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addConnectionTimeoutPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_connectionTimeout_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_connectionTimeout_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__CONNECTION_TIMEOUT, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Read Timeout feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addReadTimeoutPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_readTimeout_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_readTimeout_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__READ_TIMEOUT, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Destination Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDestinationPathPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_destinationPath_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_destinationPath_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__DESTINATION_PATH, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Destination File feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDestinationFilePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_destinationFile_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_destinationFile_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__DESTINATION_FILE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Priority feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPriorityPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_priority_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_priority_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__PRIORITY, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Estimated Size feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEstimatedSizePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_downloadTask_estimatedSize_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_downloadTask_estimatedSize_feature", "_UI_downloadTask_type"),
        downloadPackage.Literals.DOWNLOAD_TASK__ESTIMATED_SIZE, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This returns downloadTask.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/downloadTask"));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage()
  {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((downloadTask)object).getID();
    return label == null || label.length() == 0 ? getString("_UI_downloadTask_type") : getString("_UI_downloadTask_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(downloadTask.class))
    {
    case downloadPackage.DOWNLOAD_TASK__RESOURCE_LOCATION:
    case downloadPackage.DOWNLOAD_TASK__IS_URL:
    case downloadPackage.DOWNLOAD_TASK__CONNECTION_TIMEOUT:
    case downloadPackage.DOWNLOAD_TASK__READ_TIMEOUT:
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_PATH:
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_FILE:
    case downloadPackage.DOWNLOAD_TASK__PRIORITY:
    case downloadPackage.DOWNLOAD_TASK__ESTIMATED_SIZE:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
