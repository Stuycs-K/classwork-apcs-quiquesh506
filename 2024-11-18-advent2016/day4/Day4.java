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
        String[] parsed = line.replace("[", "-").replace("]", "-").split("-");
        String[] toAdd = new String[]{"","",""};
        for (int i = 0; i < parsed.length - 2; i++) {
          toAdd[0] = toAdd[0] + parsed[i];
        }
        toAdd[1] = parsed[parsed.length-2];
        toAdd[2] = parsed[parsed.length-1];
        ret.add(toAdd);

      }

      inscan.close();

    } catch (FileNotFoundException e) {
      System.out.println("could not find file");
      return new ArrayList<String[]>();
    }
    return ret;
  }
  public static void main(String args[]) {
    ArrayList<String[]> parsed = parse("input.txt");
    //System.out.println(parse("input.txt"));
    for(int i = 0; i < parsed.size(); i++) {
      System.out.println(Arrays.toString(parsed.get(i)));
    }
  }
}
