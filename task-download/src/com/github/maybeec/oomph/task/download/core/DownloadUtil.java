/**
 *
 */
package com.github.maybeec.oomph.task.download.core;

import com.github.maybeec.oomph.task.download.core.exceptions.DownloadException;
import com.github.maybeec.oomph.task.download.core.impl.DownloadUtilImpl;

/**
 * @author sholzer
 *
 */
public abstract class DownloadUtil
{

  private static DownloadUtil instance;

  public static DownloadUtil getInstance()
  {
    if (instance == null)
    {
      instance = new DownloadUtilImpl();
    }
    return instance;
  }

  /**
   * Copies a file from a resource to a destination
   * @param resourceLocation The URI of the source. Can also be an URL
   * @param isURL if true the resource will be downloaded via it's URL. If false the resource will be copied
   * @param conTo connection Timeout. Only needed if isURL is true. Throws an exception if the resource location does not respond in the specified time in ms
   * @param rTo read Timeout. Similar as conTo. Throws an exception of the resource location does not send data after connection in the specified time.
   * @param destDir the destination directory
   * @param destName the name of the resource in the destination
   * @param estimatedSize for display purposes only. Logs the estimated size in the logger
   * @throws DownloadException
   * @author sholzer (24.06.2016)
   */
  public abstract void download(String resourceLocation, boolean isURL, int conTo, int rTo, String destDir, String destName, int estimatedSize)
      throws DownloadException;

}
