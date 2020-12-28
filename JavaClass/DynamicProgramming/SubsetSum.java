package DynamicProgramming;

public class SubsetSum {
  public static void main(String[] args) {
    int[] arr = new int[]{5, 3, 2, 1, 7, 9, 8, 3};
    int sum = 11;
    int[][] dp = new int[arr.length + 5][sum + 5];
    for(int i=0; i< dp.length;i++){
      for (int j=0;j<dp[0].length;j++){
        dp[i][j] = -1;
      }
    }
    int[] arr2 = new int[]{5};
    System.out.println(ifSubSetSumExistsRec(arr, sum,0));
    System.out.println(ifSubSetSumExistsMemoisation(arr, sum,0, dp));
  }
  
  public static int ifSubSetSumExistsRec(int[] arr, int sum, int index) {

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
    
    // include me
    int ans1 = ifSubSetSumExistsRec(arr, sum - arr[index], index+1);
    
    // do not include me
    int ans2 = ifSubSetSumExistsRec(arr, sum, index+1);

    int ans = 0;
    if(ans1 == 1|| ans2 == 1){
      ans =  1;
    }
    return ans;
  }

  public static int ifSubSetSumExistsMemoisation(int[] arr, int sum, int index, int[][] dp) {

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

    if (dp[index][sum] != -1){
      return dp[index][sum];
    }else{
      // include me
      int ans1 = ifSubSetSumExistsRec(arr, sum - arr[index], index+1);
      dp[index][sum] = ans1;

      // do not include me
      int ans2 = ifSubSetSumExistsRec(arr, sum, index+1);
      dp[index][sum] = ans2;

      int ans = 0;
      if(ans1 == 1|| ans2 == 1){
        ans =  1;
      }
      return ans;
    }
  }

}
