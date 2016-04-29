/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package download.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.ecore.EClass;

import download.downloadPackage;
import download.downloadTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>download Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class downloadTaskImpl extends SetupTaskImpl implements downloadTask
{
  private static final int PRIORITY = PRIORITY_DEFAULT;

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

  @Override
  public int getPriority()
  {
    return PRIORITY;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    // TODO Implement downloadTaskImpl.isNeeded()
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    // TODO Implement downloadTaskImpl.perform()
    context.log("Implement downloadTaskImpl.perform()");
  }

  @Override
  public void dispose()
  {
    // TODO Implement downloadTaskImpl.perform() or remove this override if not needed
  }

} // downloadTaskImpl
