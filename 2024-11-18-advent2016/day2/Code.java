import java.util.*;
import java.io.*;

public class Code {
  public static int clamp(int value, int min, int max) {
    return Math.max(min, Math.min(max, value));
  } 
  public static String[] parse(String filename){
    String text = new String();
    try {
      File infile = new File(filename);
      Scanner scan = new Scanner(infile);


      while (scan.hasNextLine()) {
        text += (scan.nextLine() + "\n").replace("U", "0").replace("L", "1").replace("D", "2").replace("R", "3");
      }
      scan.close();
    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    }
    return text.split("\n");
  }

  public static void main(String args[]) {
    String[] text = parse("input.txt");
    System.out.println(Arrays.toString(text));
    int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] moves = {
      {0,1}, {-1,0}, {0,-1}, {1,0}
    };

    int x = 1;
    int y = 1;

    for (String path : text) {
      for (int i = 0; i < path.length(); i++) {
        int[] cmove = moves[Integer.parseInt(path.substring(i, i+1))];
        x = clamp(x + cmove[0], 0, 3);
        y = clamp()
      }
    }
  }
}
