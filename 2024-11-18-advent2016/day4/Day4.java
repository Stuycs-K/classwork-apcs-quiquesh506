import java.util.*;
import java.io.*;

public class Day4 {

  public static void swapStr(ArrayList<String> array, int index0, int index1) {
    String tmp = array.get(index0);
    array.set(index0, array.get(index1));
    array.set(index1, tmp);

    return;
  }

  public static void swapInt(ArrayList<Integer> array, int index0, int index1) {
    Integer tmp = array.get(index0);
    array.set(index0, array.get(index1));
    array.set(index1, tmp);

    return;
  }

  // public static int max(ArrayList<Integer> list) {
  //   int ret = 0;
  //   for(int i = 0; i < list.size(); i++) {
  //     if (list.get(i) > 0)
  //   }
  // }

  public static String getChecksum(String name) {
    ArrayList<String> letters = new ArrayList<String>();
    ArrayList<Integer> counts = new ArrayList<Integer>();

    for (int i = 0; i < name.length(); i++) {
      int index = letters.indexOf(name.substring(i,i+1));
      
      if (index == -1) {
        letters.add(name.substring(i, i+1));
        counts.add(1);
      } else {
        counts.set(index, counts.get(index) + 1);
      }
    }

    // System.out.println(letters);
    // System.out.println(counts);
    
    // System.out.println("");

    for (int i = 0; i < counts.size(); i++) {
      int iMax = 0;
      int max = 0;
      for (int j = i; j < counts.size(); j++) {
        
        //int iMax = 0;
        if (counts.get(j) > max) {
          max = counts.get(j);
          iMax = j;
        } else if (counts.get(j) == max) {
          if (letters.get(j).charAt(0) < letters.get(iMax).charAt(0)) {
            max = counts.get(j);
            iMax = j;
          }
        }
        // System.out.println(iMax);
      }
      swapStr(letters, i, iMax);
      swapInt(counts, i, iMax);

      // System.out.println(letters);
      // System.out.println(counts);
      // System.out.println("");

      
    }
    String ret = new String("");
    for(int i = 0; i < 5; i++) {
      ret = ret + letters.get(i);
    }
    
    
    return ret;
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

    // System.out.println(getChecksum("kwvacumzozilmkivlgkwvbiqvumvb"));

    // ArrayList<String> test0 = new ArrayList<String>();
    // test0.add("0");
    // test0.add("1");
    // test0.add("2");

    // System.out.println(test0);
    // swapStr(test0, 0, 2);
    // System.out.println(test0);

    int sum = 0;
    for (int i = 0; i < parsed.size(); i++) {
      if (parsed.get(i)[2].equals(getChecksum(parsed.get(i)[0]))) {
        sum += Integer.parseInt(parsed.get(i)[1]);
      }
    }
    System.out.println(sum);
  }
}
