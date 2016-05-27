/**
 */
package com.github.maybee.oomph.task.download;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.maybee.oomph.task.download.downloadPackage
 * @generated
 */
public interface downloadFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  downloadFactory eINSTANCE = com.github.maybee.oomph.task.download.impl.downloadFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  downloadTask createdownloadTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  downloadPackage getdownloadPackage();

} // downloadFactory
