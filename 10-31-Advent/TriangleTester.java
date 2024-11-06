import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TriangleTester {

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
    return;
  }

  

  public static int countTrianglesA(String filename) {
    //int[][] lengths = new int[][]();
    ArrayList<ArrayList<Integer>> lengths = new ArrayList<ArrayList<Integer>>();
    int sum = 0;
    try {
      File file = new File(filename);//1
      Scanner scan = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int count=0;
      while (scan.hasNextInt()) {
        //System.out.println(scan.hasNextLine());
        lengths.add(new ArrayList<Integer>());
        for (int i = 0; i < 3; i++) {
          if (scan.hasNextInt()) {
            lengths.get(count).add(scan.nextInt());
          } //else {
            //scan.nextLine();
          //}
          //System.out.print(lengths.get(count).get(i) + " ");
        }
        //System.out.println("");
        count++;
      }
      scan.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }

    for (int i = 0; i < lengths.size(); i++) {
      int a = lengths.get(i).get(0);
      int b = lengths.get(i).get(1);
      int c = lengths.get(i).get(2);
      if (a >= b+c) {
        sum--;
      } else if (b >= a+c) {
        sum--;
      } else if (c >= a+b) {
        sum--;
      }
      sum++;
    }


    return sum;

  }


}
