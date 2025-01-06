import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {
  public static void main(String[] args) {
    // Create a function `getMostFrequentYear` which takes the name of a CSV file as a parameter,
    // - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // and returns the year (as a String) when the most births happened.
    // If there were multiple years with the same number of births then return any of them.
    // If the given file doesn't exist, the function should return "File not found"

    // Change the path of the /births.csv source file to the path where you saved it on your computer.
    // You can find the source file in a link next to this exercise.
    System.out.println(getMostFrequentYear("files/births.csv")); // should print "2006" or "2016"
    System.out.println(getMostFrequentYear("files/not-existing-file.csv")); // should print "File not found"
  }
  public static String getMostFrequentYear(String pathName) {
    try {
      List<String> content = Files.readAllLines(Paths.get(pathName));
      HashMap<String ,Integer> yearCounter = new HashMap<>();
      String[] year;
      String[] parts;
      for (int i = 0; i < content.size(); i++) {
        parts = content.get(i).split(";"); //splits the parts
        year = parts[1].split("-"); //splits the "exact date part" in parts so the year is accessible
        if (yearCounter.containsKey(year[0])) {
          yearCounter.replace(year[0], yearCounter.get(year[0]) + 1); //adds <1> to the value from the key which is the <year>
        } else {
          yearCounter.put(year[0], 1); //puts new key value pair with key <year> and value <1>
        }
      }
      String winners = "";
      int winSize = 0;
      for (Map.Entry<String, Integer> iteratorMap: yearCounter.entrySet()) {
        if (iteratorMap.getValue() > winSize) {
          winSize = iteratorMap.getValue();
        }
      }
      for (Map.Entry<String, Integer> iteratorMap: yearCounter.entrySet()) {
        if (iteratorMap.getValue().equals(winSize)) {
          winners += iteratorMap.getKey() + " ";
        }
      }
      return winners;

    } catch (IOException e) {
      return "File not found";
    }
  }
}