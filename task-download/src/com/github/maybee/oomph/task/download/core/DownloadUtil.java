/**
 *
 */
package com.github.maybee.oomph.task.download.core;

import com.github.maybee.oomph.task.download.core.impl.DownloadUtilImpl;

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

  public abstract void download(String resourceLocation, boolean isURL, int conTo, int rTo, String destDir, String destName, int estimatedSize);

}
