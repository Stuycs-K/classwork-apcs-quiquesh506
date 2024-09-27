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
  public static void main(String[] args) {
    System.out.println(arrayToString(new int[] {1,2,3,45}));
  }
}
