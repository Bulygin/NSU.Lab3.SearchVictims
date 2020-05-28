package nsu.searchVictims;

import java.io.File;
import java.io.FilenameFilter;

class MaskFilter implements FilenameFilter {

  private String mask;

  MaskFilter(String mask) {
    this.mask = mask.substring(1);
  }

  public boolean accept(File f, String name) {
    return name.toLowerCase().endsWith(mask);
  }
}