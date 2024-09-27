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
  public static void main(String[] args) {
    int[] test = new int[]{1,2,3,45,6};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));

    test = new int[]{};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));

  }
}