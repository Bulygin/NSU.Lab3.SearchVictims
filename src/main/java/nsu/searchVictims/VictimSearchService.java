package nsu.searchVictims;

import java.io.File;

class VictimSearchService {

  private VictimSearchService() {
  }

  static void printAllMatches(String catalog, String mask) {
    File f = new File(catalog);
    if (!f.exists()) {
      System.out.println("Not folder.");
    }
    if (!f.isDirectory()) {
      System.out.println("Not directory.");
    }
    findMatch(catalog, mask);
  }

  private static void findMatch(String name, String mask) {
    File f = new File(name);
    String[] dirs = f.list();
    String[] matches = f.list(new MaskFilter(mask));

    assert matches != null;
    assert dirs != null;

    if (matches.length > 0) {
      for (String match : matches) {
        System.out.println(match);
      }
    }

    for (String s : dirs) {
      File f1 = new File(name + "\\" + s);
      if (!f1.isFile()) {
        findMatch(name + "\\" + s, mask);
      }
    }
  }
}
