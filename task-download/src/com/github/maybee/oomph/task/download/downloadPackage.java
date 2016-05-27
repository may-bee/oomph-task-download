/**
 */
package com.github.maybee.oomph.task.download;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.maybee.oomph.task.download.downloadFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/maybeec/oomph-task-download/master/task-download-updatesite/model/Task-download-1.0.ecore'"
 * @generated
 */
public interface downloadPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "download";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/task-download/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.github.maybee.oomph.task";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  downloadPackage eINSTANCE = com.github.maybee.oomph.task.download.impl.downloadPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.maybee.oomph.task.download.impl.downloadTaskImpl
   * @see com.github.maybee.oomph.task.download.impl.downloadPackageImpl#getdownloadTask()
   * @generated
   */
  int DOWNLOAD_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Resource Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__RESOURCE_LOCATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__IS_URL = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Connection Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__CONNECTION_TIMEOUT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Read Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__READ_TIMEOUT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Destination Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__DESTINATION_PATH = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Destination File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__DESTINATION_FILE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__PRIORITY = SetupPackage.SETUP_TASK_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Estimated Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK__ESTIMATED_SIZE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOWNLOAD_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 8;

  /**
   * Returns the meta object for class '{@link com.github.maybee.oomph.task.download.downloadTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask
   * @generated
   */
  EClass getdownloadTask();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#getResourceLocation <em>Resource Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource Location</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#getResourceLocation()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_ResourceLocation();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#isIsURL <em>Is URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is URL</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#isIsURL()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_IsURL();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#getConnectionTimeout <em>Connection Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connection Timeout</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#getConnectionTimeout()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_ConnectionTimeout();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#getReadTimeout <em>Read Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Read Timeout</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#getReadTimeout()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_ReadTimeout();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#getDestinationPath <em>Destination Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination Path</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#getDestinationPath()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_DestinationPath();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#getDestinationFile <em>Destination File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination File</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#getDestinationFile()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_DestinationFile();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#getPriority()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_Priority();

  /**
   * Returns the meta object for the attribute '{@link com.github.maybee.oomph.task.download.downloadTask#getEstimatedSize <em>Estimated Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Estimated Size</em>'.
   * @see com.github.maybee.oomph.task.download.downloadTask#getEstimatedSize()
   * @see #getdownloadTask()
   * @generated
   */
  EAttribute getdownloadTask_EstimatedSize();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  downloadFactory getdownloadFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.maybee.oomph.task.download.impl.downloadTaskImpl
     * @see com.github.maybee.oomph.task.download.impl.downloadPackageImpl#getdownloadTask()
     * @generated
     */
    EClass DOWNLOAD_TASK = eINSTANCE.getdownloadTask();

    /**
     * The meta object literal for the '<em><b>Resource Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__RESOURCE_LOCATION = eINSTANCE.getdownloadTask_ResourceLocation();

    /**
     * The meta object literal for the '<em><b>Is URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__IS_URL = eINSTANCE.getdownloadTask_IsURL();

    /**
     * The meta object literal for the '<em><b>Connection Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__CONNECTION_TIMEOUT = eINSTANCE.getdownloadTask_ConnectionTimeout();

    /**
     * The meta object literal for the '<em><b>Read Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__READ_TIMEOUT = eINSTANCE.getdownloadTask_ReadTimeout();

    /**
     * The meta object literal for the '<em><b>Destination Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__DESTINATION_PATH = eINSTANCE.getdownloadTask_DestinationPath();

    /**
     * The meta object literal for the '<em><b>Destination File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__DESTINATION_FILE = eINSTANCE.getdownloadTask_DestinationFile();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__PRIORITY = eINSTANCE.getdownloadTask_Priority();

    /**
     * The meta object literal for the '<em><b>Estimated Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOWNLOAD_TASK__ESTIMATED_SIZE = eINSTANCE.getdownloadTask_EstimatedSize();

  }

} // downloadPackage
