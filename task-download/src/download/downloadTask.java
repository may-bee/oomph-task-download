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
package download;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>download Task</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see download.downloadPackage#getdownloadTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.download' repository='http://download.example.org/task-download/updates' installableUnits='task-download.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface downloadTask extends SetupTask
{

} // downloadTask
