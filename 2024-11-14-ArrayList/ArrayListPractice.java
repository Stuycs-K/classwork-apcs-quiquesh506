import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> list = new ArrayList<String>(size);
    for (int i = 0; i < list.size(); i++) {
      int rand = (int)(Math.random() * 11);
      list.set(i, "" + rand);
      if (rand == 0) {
        list.set(i, "");
      }
    }
    return list;
  }
  
}
