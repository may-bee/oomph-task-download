/**
 *
 */
package download.core.impl;

import download.core.DownloadUtil;
import download.core.SetupTaskLogger;

import java.io.File;
import java.net.URL;

/**
 * @author sholzer
 *
 */
public class DownloadUtilImpl extends DownloadUtil
{

  /*
   * (non-Javadoc)
   * @see downloadtask.core.DownloadUtil#download(java.lang.String, boolean, int, int, java.lang.String, java.lang.String)
   */
  @Override
  public void download(String resourceLocation, boolean isURL, int conTo, int rTo, String destDir, String destName, int estimatedSize)
  {
    SetupTaskLogger.getLogger().logInfo("Starting Download");
    SetupTaskLogger.getLogger().log("From: " + resourceLocation);
    SetupTaskLogger.getLogger().log("To: " + destDir + "/" + destName);

    if (isURL)
    {
      SetupTaskLogger.getLogger().log("connection timeout: " + conTo);
      SetupTaskLogger.getLogger().log("read timeout: " + rTo);
      if (estimatedSize > -1)
      {
        SetupTaskLogger.getLogger().log("Estimated size: " + estimatedSize + " MB");
      }
      try
      {
        FileUtils.copyURLToFile(new URL(resourceLocation), new File(destDir + "/" + destName), conTo, rTo);
        SetupTaskLogger.getLogger().logInfo("Download done");
      }
      catch (Exception ex)
      {
        SetupTaskLogger.getLogger().logError(ex.getMessage());
      }
    }
    else
    {
      try
      {
        FileUtils.copyFile(new File(resourceLocation), new File(destDir + "/" + destName));
        SetupTaskLogger.getLogger().logInfo("Download done");
      }
      catch (Exception e)
      {
        SetupTaskLogger.getLogger().logError(e.getMessage());
      }
    }

  }

}
