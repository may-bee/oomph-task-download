/**
 */
package download.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import download.downloadFactory;
import download.downloadPackage;
import download.downloadTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class downloadFactoryImpl extends EFactoryImpl implements downloadFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static downloadFactory init()
  {
    try
    {
      downloadFactory thedownloadFactory = (downloadFactory)EPackage.Registry.INSTANCE.getEFactory(downloadPackage.eNS_URI);
      if (thedownloadFactory != null)
      {
        return thedownloadFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new downloadFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public downloadFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case downloadPackage.DOWNLOAD_TASK:
      return createdownloadTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public downloadTask createdownloadTask()
  {
    downloadTaskImpl downloadTask = new downloadTaskImpl();
    return downloadTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public downloadPackage getdownloadPackage()
  {
    return (downloadPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static downloadPackage getPackage()
  {
    return downloadPackage.eINSTANCE;
  }

} // downloadFactoryImpl
