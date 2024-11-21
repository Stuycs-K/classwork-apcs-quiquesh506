import java.util.*;
import java.io.*;

public class Day4 {
  public static String[] getChecksum(String name) {
    return new String[]{""};
  }
  public static ArrayList<String[]> parse(String filename) {
    ArrayList<String[]> ret = new ArrayList<String[]>();
    
    try {
      File infile = new File(filename);
      Scanner inscan = new Scanner(infile);

      while (inscan.hasNextLine()) {
        String line = inscan.nextLine();
        String[] parsed = line.replace("[", "-").replace("]", "").split("-");
        ret.add(parsed);
      }

    } catch (FileNotFoundException e) {
      System.out.println("could not find file");
      return new ArrayList<String[]>();
    }
    return new ArrayList<String[]>();
  }
  public static void main(String args[]) {
    System.out.println("hello");
  }
}
