package nsu.searchVictims;

public class Main {

  public static void main(String[] args) {
    String catalog = "D:\\test";
    String mask = "*.docx";

    VictimSearchService.printAllMatches(catalog, mask);
  }
}
