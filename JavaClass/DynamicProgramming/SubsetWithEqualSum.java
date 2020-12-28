package DynamicProgramming;

public class SubsetWithEqualSum {

  public static void main(String[] args) {
    int[] arr = new int[]{5, 3, 2, 1, 7, 9, 8, 3};
    int[] arr2 = new int[]{5};

    if(arr.length % 2 == 0){
      int sum = 0;
      for (int value : arr) {
        sum = sum + value;
      }

      int[][] dp = new int[arr.length+5][sum+5];
      for(int i=0; i< dp.length;i++){
        for (int j=0;j<dp[0].length;j++){
          dp[i][j] = -1;
        }
      }

//      int res = ifSubSetWithEqualSumExistsRec(arr, sum/2,0);
      int res = ifSubSetWithEqualSumExistsMemoisation(arr, sum/2,0, dp);
      if (res == 1){
        System.out.println(1);
      }else{
        System.out.println(0);
      }
    }else{
      System.out.println(0);
    }
  }

  private static int ifSubSetWithEqualSumExistsMemoisation(int[] arr, int sum, int index, int[][] dp) {
    //base case
    if (sum == 0){
      return 1;
    }

    if (arr.length == 1 && arr[0] != sum) {
      return 0;
    }

    if (index == arr.length && sum != 0) {
      return 0;
    }

    if(sum < arr[index]){
      dp[index][sum] = 0;
      return 0;
    }

    if(dp[index][sum] != -1){
      return dp[index][sum];
    }else{
      // include me
      int ans1 = ifSubSetWithEqualSumExistsMemoisation(arr, sum - arr[index], index+1, dp);
      dp[index][sum] = ans1;

      // do not include me
      int ans2 = ifSubSetWithEqualSumExistsMemoisation(arr, sum, index+1, dp);
      dp[index][sum] = ans2;

      int ans = 0;
      if(ans1 == 1|| ans2 == 1){
        ans =  1;
      }
      return ans;
    }
  }

  private static int ifSubSetWithEqualSumExistsRec(int[] arr, int sum, int index) {

    //base case
    if (sum == 0){
      return 1;
    }

    if (arr.length == 1 && arr[0] != sum) {
      return 0;
    }

    if (index == arr.length && sum != 0) {
      return 0;
    }

    if(sum < arr[index]){
      return 0;
    }

    // include me
    int ans1 = ifSubSetWithEqualSumExistsRec(arr, sum - arr[index], index+1);

    // do not include me
    int ans2 = ifSubSetWithEqualSumExistsRec(arr, sum, index+1);

    int ans = 0;
    if(ans1 == 1 || ans2 == 1){
      ans =  1;
    }
    return ans;
  }
}
