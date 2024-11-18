import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Distance {
  public static int[][] lexInput(String filename) {
    String text = new String()
    try {
      File infile = new File (filename);
      Scanner inscan = new Scanner(File);
      while (inscan.hasNextLine()) {
        text = text + inscan.nextLine();
      }
    } catch (FileNotFoundException e) {
      System.out.println("file not found");
      exit(1);
    }
    String[] tokens = text.split(", ");
    int[][] ret = new int[tokens.length][2];
    for (int i = 0; i < tokens.length; i++) {
      if (tokens[i].charAt(0) == 'R') {
        ret[i][0] = -1;
      } else {
        ret[i][0] = 1;
      }
      ret[i][1] = Integer.parseInt(tokens[i].substring(1));
    }
    return ret;
  }
}
