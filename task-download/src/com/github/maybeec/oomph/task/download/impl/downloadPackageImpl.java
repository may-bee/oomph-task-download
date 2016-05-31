/**
 */
package com.github.maybeec.oomph.task.download.impl;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.github.maybeec.oomph.task.download.downloadFactory;
import com.github.maybeec.oomph.task.download.downloadPackage;
import com.github.maybeec.oomph.task.download.downloadTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class downloadPackageImpl extends EPackageImpl implements downloadPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass downloadTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.github.maybeec.oomph.task.download.downloadPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private downloadPackageImpl()
  {
    super(eNS_URI, downloadFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link downloadPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static downloadPackage init()
  {
    if (isInited)
    {
      return (downloadPackage)EPackage.Registry.INSTANCE.getEPackage(downloadPackage.eNS_URI);
    }

    // Obtain or create and register package
    downloadPackageImpl thedownloadPackage = (downloadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof downloadPackageImpl ? EPackage.Registry.INSTANCE
        .get(eNS_URI) : new downloadPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    thedownloadPackage.createPackageContents();

    // Initialize created meta-data
    thedownloadPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thedownloadPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(downloadPackage.eNS_URI, thedownloadPackage);
    return thedownloadPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdownloadTask()
  {
    return downloadTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_ResourceLocation()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_IsURL()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_ConnectionTimeout()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_ReadTimeout()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_DestinationPath()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_DestinationFile()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_Priority()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdownloadTask_EstimatedSize()
  {
    return (EAttribute)downloadTaskEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public downloadFactory getdownloadFactory()
  {
    return (downloadFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    downloadTaskEClass = createEClass(DOWNLOAD_TASK);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__RESOURCE_LOCATION);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__IS_URL);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__CONNECTION_TIMEOUT);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__READ_TIMEOUT);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__DESTINATION_PATH);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__DESTINATION_FILE);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__PRIORITY);
    createEAttribute(downloadTaskEClass, DOWNLOAD_TASK__ESTIMATED_SIZE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    downloadTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(downloadTaskEClass, downloadTask.class, "downloadTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdownloadTask_ResourceLocation(), ecorePackage.getEString(), "resourceLocation", null, 1, 1, downloadTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdownloadTask_IsURL(), ecorePackage.getEBoolean(), "isURL", "false", 0, 1, downloadTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdownloadTask_ConnectionTimeout(), ecorePackage.getEInt(), "connectionTimeout", "1000", 0, 1, downloadTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdownloadTask_ReadTimeout(), ecorePackage.getEInt(), "readTimeout", "1500", 0, 1, downloadTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdownloadTask_DestinationPath(), ecorePackage.getEString(), "destinationPath", "", 1, 1, downloadTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdownloadTask_DestinationFile(), ecorePackage.getEString(), "destinationFile", null, 1, 1, downloadTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdownloadTask_Priority(), ecorePackage.getEInt(), "priority", "500", 0, 1, downloadTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdownloadTask_EstimatedSize(), ecorePackage.getEInt(), "estimatedSize", "-1", 0, 1, downloadTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource("https://raw.githubusercontent.com/maybeec/oomph-task-download/master/task-download-updatesite/model/Task-download-1.0.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation",
        "https://raw.githubusercontent.com/maybeec/oomph-task-download/master/task-download-updatesite/model/Task-download-1.0.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(downloadTaskEClass, source, new String[] { "variableName", "p2.download", "repository", "http://download.example.org/task-download/updates",
        "installableUnits", "task-download.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(downloadTaskEClass, source, new String[] { "triggers", "BOOTSTRAP STARTUP MANUAL" });
  }

} // downloadPackageImpl
