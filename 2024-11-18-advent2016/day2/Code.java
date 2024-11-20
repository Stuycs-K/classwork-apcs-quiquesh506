import java.util.*;
import java.io.*;

public class Code {
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

    int x = 1;
    int y = 1;

    for (String path : text) {

    }
  }
}
