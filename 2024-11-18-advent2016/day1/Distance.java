import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Distance {
  public static int[][] lexInput(String filename) {
    String text = new String();
    try {
      File infile = new File (filename);
      Scanner inscan = new Scanner(infile);
      while (inscan.hasNextLine()) {
        text = text + inscan.nextLine();
      }
    } catch (FileNotFoundException e) {
      System.out.println("file not found");
      return new int [][] {{-2, -2}};
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
  public static int solve(int[][] tokens) {
    int[] coords = new int[]{0,0};
    int facing = 0;
    int[][] offset = {
      {0,1}, {-1,0}, {0,-1}, {1,0}
    };

    for (int[] i : tokens) {
      facing = ((facing + 4 + i[0]) % 4) % 4;
      coords[0] += offset[facing][0] * i[1];
      coords[1] += offset[facing][1] * i[1];
    }
    return Math.abs(coords[0]) + Math.abs(coords[1]);
  }
  public static void main(String args[]) {
    int[][] toks = lexInput("input.txt");
    //System.out.println(Arrays.deepToString(lexInput("input.txt")));
    System.out.println(solve(toks));
  }
}
