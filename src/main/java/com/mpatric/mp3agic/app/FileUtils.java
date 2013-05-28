package com.mpatric.mp3agic.app;

public class FileUtils {

  public static String extractFilename(String filename) {
    int bsPos = filename.lastIndexOf('\\');
    int fsPos = filename.lastIndexOf('/');
    if (bsPos >= 0 || fsPos >= 0) {
      if (fsPos == -1 || bsPos > fsPos) {
        return filename.substring(bsPos + 1);
      }
      return filename.substring(fsPos + 1);
    }
    return filename;
  }
  
  public static String extractPath(String filename) {
    int bsPos = filename.lastIndexOf('\\');
    int fsPos = filename.lastIndexOf('/');
    if (bsPos >= 0 || fsPos >= 0) {
      if (fsPos == -1 || bsPos > fsPos) {
        return filename.substring(0, bsPos + 1);
      }
      return filename.substring(0, fsPos + 1);
    }
    return "";
  }
  
  public static String extractExtension(String filename) {
    int dPos = filename.lastIndexOf('.');
    if (dPos >= 0) {
      return filename.substring(dPos);
    }
    return "";
  }
}
