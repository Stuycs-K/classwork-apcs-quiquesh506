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
      ret[i] = ary2[i - ary1.length];
    }
    return ret;
  }

  public static void main(String[] args) {
    System.out.println("Test for return copy:");
    int[] test = new int[]{1,2,3,45,6};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));
    System.out.println("expect true:" + arrayToString(returnCopy(test)).equals(arrayToString(test)));

    test = new int[]{};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));
    System.out.println("expect true:" + arrayToString(returnCopy(test)).equals(arrayToString(test)));

    test = new int[]{123,13242,53533,53,66,7};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));
    System.out.println("expect true:" + arrayToString(returnCopy(test)).equals(arrayToString(test)));

    test = new int[]{2345678,4567,965467};
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(arrayToString(test));
    System.out.println("expect true:" + arrayToString(returnCopy(test)).equals(arrayToString(test)));

    System.out.println("Test for concatArray:");

    int[] test1 = new int[]{8,9,5,66,7};
    int[] test2 = new int[]{234,25435643,66};

    System.out.println(arrayToString(test1) + arrayToString(test2));
    System.out.println(arrayToString(concatArray(test1, test2)));

    test1 = new int[]{};
    test2 = new int[]{234,25435643,66};

    System.out.println(arrayToString(test1) + arrayToString(test2));
    System.out.println(arrayToString(concatArray(test1, test2)));

    test1 = new int[]{};
    test2 = new int[]{};

    System.out.println(arrayToString(test1) + arrayToString(test2));
    System.out.println(arrayToString(concatArray(test1, test2)));
  }
}
