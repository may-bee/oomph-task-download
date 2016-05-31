/**
 */
package com.github.maybeec.oomph.task.download;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#getResourceLocation <em>Resource Location</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#isIsURL <em>Is URL</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#getReadTimeout <em>Read Timeout</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#getDestinationPath <em>Destination Path</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#getDestinationFile <em>Destination File</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.github.maybeec.oomph.task.download.downloadTask#getEstimatedSize <em>Estimated Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.download' repository='http://download.example.org/task-download/updates' installableUnits='task-download.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface downloadTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Resource Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Location</em>' attribute.
   * @see #setResourceLocation(String)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_ResourceLocation()
   * @model required="true"
   * @generated
   */
  String getResourceLocation();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#getResourceLocation <em>Resource Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Location</em>' attribute.
   * @see #getResourceLocation()
   * @generated
   */
  void setResourceLocation(String value);

  /**
   * Returns the value of the '<em><b>Is URL</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is URL</em>' attribute.
   * @see #setIsURL(boolean)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_IsURL()
   * @model default="false"
   * @generated
   */
  boolean isIsURL();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#isIsURL <em>Is URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is URL</em>' attribute.
   * @see #isIsURL()
   * @generated
   */
  void setIsURL(boolean value);

  /**
   * Returns the value of the '<em><b>Connection Timeout</b></em>' attribute.
   * The default value is <code>"1000"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection Timeout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection Timeout</em>' attribute.
   * @see #setConnectionTimeout(int)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_ConnectionTimeout()
   * @model default="1000"
   * @generated
   */
  int getConnectionTimeout();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#getConnectionTimeout <em>Connection Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection Timeout</em>' attribute.
   * @see #getConnectionTimeout()
   * @generated
   */
  void setConnectionTimeout(int value);

  /**
   * Returns the value of the '<em><b>Read Timeout</b></em>' attribute.
   * The default value is <code>"1500"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Timeout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Timeout</em>' attribute.
   * @see #setReadTimeout(int)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_ReadTimeout()
   * @model default="1500"
   * @generated
   */
  int getReadTimeout();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#getReadTimeout <em>Read Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Timeout</em>' attribute.
   * @see #getReadTimeout()
   * @generated
   */
  void setReadTimeout(int value);

  /**
   * Returns the value of the '<em><b>Destination Path</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination Path</em>' attribute.
   * @see #setDestinationPath(String)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_DestinationPath()
   * @model default="" required="true"
   * @generated
   */
  String getDestinationPath();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#getDestinationPath <em>Destination Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination Path</em>' attribute.
   * @see #getDestinationPath()
   * @generated
   */
  void setDestinationPath(String value);

  /**
   * Returns the value of the '<em><b>Destination File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination File</em>' attribute.
   * @see #setDestinationFile(String)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_DestinationFile()
   * @model required="true"
   * @generated
   */
  String getDestinationFile();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#getDestinationFile <em>Destination File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination File</em>' attribute.
   * @see #getDestinationFile()
   * @generated
   */
  void setDestinationFile(String value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The default value is <code>"500"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_Priority()
   * @model default="500"
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

  /**
   * Returns the value of the '<em><b>Estimated Size</b></em>' attribute.
   * The default value is <code>"-1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimated Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimated Size</em>' attribute.
   * @see #setEstimatedSize(int)
   * @see com.github.maybeec.oomph.task.download.downloadPackage#getdownloadTask_EstimatedSize()
   * @model default="-1"
   * @generated
   */
  int getEstimatedSize();

  /**
   * Sets the value of the '{@link com.github.maybeec.oomph.task.download.downloadTask#getEstimatedSize <em>Estimated Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estimated Size</em>' attribute.
   * @see #getEstimatedSize()
   * @generated
   */
  void setEstimatedSize(int value);

} // downloadTask
