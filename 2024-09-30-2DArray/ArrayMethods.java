//Henry Santos Hendricks henrys8913@nycstudents.net
// Jessica Seto jessicas388@nycstudents.net
public class ArrayMethods {
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]nums){
    String ret = new String("[");
    for (int i = 0; i < nums.length; i++) {
      ret += nums[i];
      if (i < nums.length - 1) {
        ret += ", ";
      }
    }
    return ret + "]";
  }

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
  public static String arrToString(int[][]nums){
  //this should use arrToString(int[])
  String newArr = new String("[");
  for (int i = 0; i < nums.length; i++) {
    newArr += arrToString(nums[i]);
    if (i != nums.length - 1) {
      newArr += ", ";
    }
  }
  return newArr + "]";
}

/*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
          sum += nums[i][j];
      }
    }
    return sum;
  }

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    int[][] ret = new int[nums[0].length][nums.length];

    for (int i = 0; i < nums[0].length; i++) {
      for (int j = 0; j < nums.length; j++) {
        ret[i][j] = nums[j][i];
      }
    }

    return ret;
  }

  public static void main(String[] args){
    System.out.println("Tests for arrToString");
    int[][] test = new int[][] {};
    System.out.println(arrToString(test));
    test = new int[][] {{2, 2}, {5 , 7}, {1, 4}};
    System.out.println(arrToString(test));

    test = new int[][] {{2, 4, 5, 6,2}};
    System.out.println(arrToString(test));

    test = new int[][] {{2, 4}, {}, {5, 9}};
    System.out.println(arrToString(test));

    System.out.println("Tests for arr2DSum");

    test = new int[][] {};
    System.out.println("Expected: " + 0);
    System.out.println(arr2DSum(test));
    test = new int[][] {{2, 2}, {5 , 7}, {1, 4}};
    System.out.println("Expected: " + (2+2+5+7+1+4));
    System.out.println(arr2DSum(test));

    test = new int[][] {{2, 4, 5, 6,2}};
    System.out.println("Expected: " + (2+4+5+6+2));
    System.out.println(arr2DSum(test));

    test = new int[][] {{2, 4}, {}, {5, 9}};
    System.out.println("Expected: " + (2+4+5+9));
    System.out.println(arr2DSum(test));

    System.out.println("Tests for swapRC");

    test = new int[][]{{1,2,3},{4,5,6}};
    System.out.println("Expected: {{1,4},{2,5},{3,6}}");
    System.out.println(arrToString(swapRC(test)));

    test = new int[][]{{7,2,6, 12},{4,18,6, 64}};
    System.out.println("Expected: {{7,4},{2,18},{6,6}, {12,64}}");
    System.out.println(arrToString(swapRC(test)));

    test = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    System.out.println("Expected: {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}}");
    System.out.println(arrToString(swapRC(test)));
  }

}
