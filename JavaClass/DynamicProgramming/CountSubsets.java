package DynamicProgramming;

public class CountSubsets {

  static int base = 50;
  static int max_sum = 50;
  static int min_sum = 50;
  static int maxN = 20;
  static int[][] dp = new int[maxN][max_sum + min_sum];
  static boolean[][] v = new boolean[maxN][max_sum + min_sum];

  public static void main(String[] args){
    int[] arr = new int[]{5, 3, 2, 1, 7, 9, 8, 3};
    int[] arr2 = new int[]{5};
    int[] arr3 = new int[]{1, 2, 3};
    int sum =6;

    System.out.println(countNoOfSubsets(arr3, sum, 0));
  }

  public static int countNoOfSubsets(int[] arr, int sum, int index) {
    if (index == arr.length) {
      if (sum == 0) {
        return 1;
      }else{
        return 0;
      }
    }

//    if (sum < arr[index]) {
//      dp[index][sum] += countNoOfSubsets(arr, sum, index + 1, dp, v, base);
//      return dp[index][sum];
//    }

    if (v[index][sum + base]) {
      return dp[index][sum + base];
    }

    v[index][sum + base] = true;

    dp[index][sum + base] = countNoOfSubsets(arr, sum - arr[index], index + 1) +
        countNoOfSubsets(arr, sum, index + 1);

    return dp[index][sum + base];
  }
}
