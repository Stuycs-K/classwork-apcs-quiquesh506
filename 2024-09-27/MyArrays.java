public class MyArrays {
  public static String arrayToString(int[] nums) {
    String ret = new String("[");
    for (int i = 0; i < nums.length; i++) {
      ret += nums[i];
      if (i < nums.length - 1) {
        ret += ", ";
      }
    }
    return ret + "]";
  }
  public static int[] returnCopy(int[] ary) {
    int[] ret = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      ret[i] = ary[i];
    }
    return ret;
  }
  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] ret = new int[ary1.length + ary2.length];

    for (int i = 0; i < ary1.length; i++) {
      ret[i] = ary1[i];
    }
    for (int i = ary1.length; i < ary1.length + ary2.length; i++) {
      ret[i] = ary2[i];
    }
    return ret;
  }
  public static void main(String[] args) {
    int[] test = new int[]{1,2,3,45,6};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));

    test = new int[]{};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));

  }
}
