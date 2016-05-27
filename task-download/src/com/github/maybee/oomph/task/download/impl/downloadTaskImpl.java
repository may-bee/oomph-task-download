/**
 */
package com.github.maybee.oomph.task.download.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.github.maybee.oomph.task.download.downloadPackage;
import com.github.maybee.oomph.task.download.downloadTask;
import com.github.maybee.oomph.task.download.core.DownloadUtil;
import com.github.maybee.oomph.task.download.core.SetupTaskLogger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#getResourceLocation <em>Resource Location</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#isIsURL <em>Is URL</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#getReadTimeout <em>Read Timeout</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#getDestinationPath <em>Destination Path</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#getDestinationFile <em>Destination File</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.github.maybee.oomph.task.download.impl.downloadTaskImpl#getEstimatedSize <em>Estimated Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class downloadTaskImpl extends SetupTaskImpl implements downloadTask
{
  /**
   * The default value of the '{@link #getResourceLocation() <em>Resource Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceLocation()
   * @generated
   * @ordered
   */
  protected static final String RESOURCE_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResourceLocation() <em>Resource Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceLocation()
   * @generated
   * @ordered
   */
  protected String resourceLocation = RESOURCE_LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #isIsURL() <em>Is URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsURL()
   * @generated
   * @ordered
   */
  protected static final boolean IS_URL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsURL() <em>Is URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsURL()
   * @generated
   * @ordered
   */
  protected boolean isURL = IS_URL_EDEFAULT;

  /**
   * The default value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionTimeout()
   * @generated
   * @ordered
   */
  protected static final int CONNECTION_TIMEOUT_EDEFAULT = 1000;

  /**
   * The cached value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionTimeout()
   * @generated
   * @ordered
   */
  protected int connectionTimeout = CONNECTION_TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getReadTimeout() <em>Read Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadTimeout()
   * @generated
   * @ordered
   */
  protected static final int READ_TIMEOUT_EDEFAULT = 1500;

  /**
   * The cached value of the '{@link #getReadTimeout() <em>Read Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadTimeout()
   * @generated
   * @ordered
   */
  protected int readTimeout = READ_TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getDestinationPath() <em>Destination Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationPath()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_PATH_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getDestinationPath() <em>Destination Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationPath()
   * @generated
   * @ordered
   */
  protected String destinationPath = DESTINATION_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getDestinationFile() <em>Destination File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationFile()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestinationFile() <em>Destination File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationFile()
   * @generated
   * @ordered
   */
  protected String destinationFile = DESTINATION_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 500;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

  /**
   * The default value of the '{@link #getEstimatedSize() <em>Estimated Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimatedSize()
   * @generated
   * @ordered
   */
  protected static final int ESTIMATED_SIZE_EDEFAULT = -1;

  /**
   * The cached value of the '{@link #getEstimatedSize() <em>Estimated Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimatedSize()
   * @generated
   * @ordered
   */
  protected int estimatedSize = ESTIMATED_SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected downloadTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return downloadPackage.Literals.DOWNLOAD_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResourceLocation()
  {
    return resourceLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceLocation(String newResourceLocation)
  {
    String oldResourceLocation = resourceLocation;
    resourceLocation = newResourceLocation;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__RESOURCE_LOCATION, oldResourceLocation, resourceLocation));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsURL()
  {
    return isURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsURL(boolean newIsURL)
  {
    boolean oldIsURL = isURL;
    isURL = newIsURL;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__IS_URL, oldIsURL, isURL));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getConnectionTimeout()
  {
    return connectionTimeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectionTimeout(int newConnectionTimeout)
  {
    int oldConnectionTimeout = connectionTimeout;
    connectionTimeout = newConnectionTimeout;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__CONNECTION_TIMEOUT, oldConnectionTimeout, connectionTimeout));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getReadTimeout()
  {
    return readTimeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadTimeout(int newReadTimeout)
  {
    int oldReadTimeout = readTimeout;
    readTimeout = newReadTimeout;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__READ_TIMEOUT, oldReadTimeout, readTimeout));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestinationPath()
  {
    return destinationPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationPath(String newDestinationPath)
  {
    String oldDestinationPath = destinationPath;
    destinationPath = newDestinationPath;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__DESTINATION_PATH, oldDestinationPath, destinationPath));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestinationFile()
  {
    return destinationFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationFile(String newDestinationFile)
  {
    String oldDestinationFile = destinationFile;
    destinationFile = newDestinationFile;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__DESTINATION_FILE, oldDestinationFile, destinationFile));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__PRIORITY, oldPriority, priority));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEstimatedSize()
  {
    return estimatedSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstimatedSize(int newEstimatedSize)
  {
    int oldEstimatedSize = estimatedSize;
    estimatedSize = newEstimatedSize;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, downloadPackage.DOWNLOAD_TASK__ESTIMATED_SIZE, oldEstimatedSize, estimatedSize));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case downloadPackage.DOWNLOAD_TASK__RESOURCE_LOCATION:
      return getResourceLocation();
    case downloadPackage.DOWNLOAD_TASK__IS_URL:
      return isIsURL();
    case downloadPackage.DOWNLOAD_TASK__CONNECTION_TIMEOUT:
      return getConnectionTimeout();
    case downloadPackage.DOWNLOAD_TASK__READ_TIMEOUT:
      return getReadTimeout();
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_PATH:
      return getDestinationPath();
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_FILE:
      return getDestinationFile();
    case downloadPackage.DOWNLOAD_TASK__PRIORITY:
      return getPriority();
    case downloadPackage.DOWNLOAD_TASK__ESTIMATED_SIZE:
      return getEstimatedSize();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case downloadPackage.DOWNLOAD_TASK__RESOURCE_LOCATION:
      setResourceLocation((String)newValue);
      return;
    case downloadPackage.DOWNLOAD_TASK__IS_URL:
      setIsURL((Boolean)newValue);
      return;
    case downloadPackage.DOWNLOAD_TASK__CONNECTION_TIMEOUT:
      setConnectionTimeout((Integer)newValue);
      return;
    case downloadPackage.DOWNLOAD_TASK__READ_TIMEOUT:
      setReadTimeout((Integer)newValue);
      return;
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_PATH:
      setDestinationPath((String)newValue);
      return;
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_FILE:
      setDestinationFile((String)newValue);
      return;
    case downloadPackage.DOWNLOAD_TASK__PRIORITY:
      setPriority((Integer)newValue);
      return;
    case downloadPackage.DOWNLOAD_TASK__ESTIMATED_SIZE:
      setEstimatedSize((Integer)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case downloadPackage.DOWNLOAD_TASK__RESOURCE_LOCATION:
      setResourceLocation(RESOURCE_LOCATION_EDEFAULT);
      return;
    case downloadPackage.DOWNLOAD_TASK__IS_URL:
      setIsURL(IS_URL_EDEFAULT);
      return;
    case downloadPackage.DOWNLOAD_TASK__CONNECTION_TIMEOUT:
      setConnectionTimeout(CONNECTION_TIMEOUT_EDEFAULT);
      return;
    case downloadPackage.DOWNLOAD_TASK__READ_TIMEOUT:
      setReadTimeout(READ_TIMEOUT_EDEFAULT);
      return;
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_PATH:
      setDestinationPath(DESTINATION_PATH_EDEFAULT);
      return;
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_FILE:
      setDestinationFile(DESTINATION_FILE_EDEFAULT);
      return;
    case downloadPackage.DOWNLOAD_TASK__PRIORITY:
      setPriority(PRIORITY_EDEFAULT);
      return;
    case downloadPackage.DOWNLOAD_TASK__ESTIMATED_SIZE:
      setEstimatedSize(ESTIMATED_SIZE_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case downloadPackage.DOWNLOAD_TASK__RESOURCE_LOCATION:
      return RESOURCE_LOCATION_EDEFAULT == null ? resourceLocation != null : !RESOURCE_LOCATION_EDEFAULT.equals(resourceLocation);
    case downloadPackage.DOWNLOAD_TASK__IS_URL:
      return isURL != IS_URL_EDEFAULT;
    case downloadPackage.DOWNLOAD_TASK__CONNECTION_TIMEOUT:
      return connectionTimeout != CONNECTION_TIMEOUT_EDEFAULT;
    case downloadPackage.DOWNLOAD_TASK__READ_TIMEOUT:
      return readTimeout != READ_TIMEOUT_EDEFAULT;
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_PATH:
      return DESTINATION_PATH_EDEFAULT == null ? destinationPath != null : !DESTINATION_PATH_EDEFAULT.equals(destinationPath);
    case downloadPackage.DOWNLOAD_TASK__DESTINATION_FILE:
      return DESTINATION_FILE_EDEFAULT == null ? destinationFile != null : !DESTINATION_FILE_EDEFAULT.equals(destinationFile);
    case downloadPackage.DOWNLOAD_TASK__PRIORITY:
      return priority != PRIORITY_EDEFAULT;
    case downloadPackage.DOWNLOAD_TASK__ESTIMATED_SIZE:
      return estimatedSize != ESTIMATED_SIZE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (resourceLocation: ");
    result.append(resourceLocation);
    result.append(", isURL: ");
    result.append(isURL);
    result.append(", connectionTimeout: ");
    result.append(connectionTimeout);
    result.append(", readTimeout: ");
    result.append(readTimeout);
    result.append(", destinationPath: ");
    result.append(destinationPath);
    result.append(", destinationFile: ");
    result.append(destinationFile);
    result.append(", priority: ");
    result.append(priority);
    result.append(", estimatedSize: ");
    result.append(estimatedSize);
    result.append(')');
    return result.toString();
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    SetupTaskLogger.getLogger().setContext(context);
    DownloadUtil downloadUtil = DownloadUtil.getInstance();
    downloadUtil.download(resourceLocation, isURL, connectionTimeout, readTimeout, destinationPath, destinationFile, estimatedSize);
  }

  @Override
  public void dispose()
  {

  }

} // downloadTaskImpl
