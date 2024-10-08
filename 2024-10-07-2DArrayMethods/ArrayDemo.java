import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    // Test cases for countZeroes2D
    System.out.println("tests for countZeroes2D:");
    int[][] test = new int[][]{{1,2,0,5,0},{0, 0, 0, 45}, {2,3,0}}; //6
    System.out.println(countZeros2D(test));

    test = new int[][]{{},{0, 0, 0, 45}, {2,3,0}}; //4
    System.out.println(countZeros2D(test));

    test = new int[][]{}; // 0
    System.out.println(countZeros2D(test));

    System.out.println("Tests for html table:");

    //<table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr><tr><td>5</td><td>6</td></tr><tr><td>7</td></tr></table>
    test = new int[][]{{1,2,3,4},{5,6},{7}}; 
    System.out.println(htmlTable(test));

    //<table><tr></tr><tr><td>5</td><td>6</td></tr><tr><td>7</td></tr></table>
    test = new int[][]{{},{5,6},{7}}; 
    System.out.println(htmlTable(test));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]nums){
  //this should use arrToString(int[])
  String ret = new String("[");
  for (int i = 0; i < nums.length; i++) {
    ret += arrToString(nums[i]);
    if (i != nums.length - 1) {
      ret += ", ";
    }
  }
  return ret + "]";
}

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          sum += 1;
        }
      }
    }
    return sum;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][]nums){
     int sum = 0;
   //use a nested loop to solve this
     for(int i = 0; i < nums.length; i++){
       for(int j = 0; j < nums[i].length; j++){
         sum+= nums[i][j];
       }
     }

     return sum;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
  for(int i = 0; i < vals.length; i++){
    for(int j = 0; j < vals[i].length; j++){
      if(vals[i][j] < 0){
        if(i == j){
          vals[i][j] = 1;
        }else{
          vals[i][j] = 0;
        }
      }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copy(int[] nums) {
  int[] ret = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    ret[i] = nums[i];
  }
  return ret;
}
public static int[][] copy(int[][] nums){
  int[][] ret = new int[nums.length][];
  for (int i = 0; i < nums.length; i++) {
    ret[i] = copy(nums[i]);
  }
  return ret;
}

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] out = new int[nums[0].length][nums.length];
    for(int i = 0; i < nums.length; i++){
	  for(int j = 0; j < nums[0].length; j++){
  		out[j][i] = nums[i][j];}}
    return out;

  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
