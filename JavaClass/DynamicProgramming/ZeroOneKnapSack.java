package DynamicProgramming;

public class ZeroOneKnapSack {

  public static void main(String[] ags) {
    int[] weight = new int[]{2, 3, 1, 4};
    int[] value = new int[]{4, 5, 3, 7};
    int capacity = 5;
    int[][] dp = new int[capacity+5][weight.length+5];

    for(int i=0; i< dp.length;i++){
      for (int j=0;j<dp[0].length;j++){
        dp[i][j] = -1;
      }
    }
    System.out.println(knapsack01Rec(weight,value, capacity,0));
    System.out.println(knapsack01Memoisation(weight, value,capacity, 0, dp));
  }

  public static int knapsack01Rec(int[] weight, int[] value, int capacity, int index) {

    //capacity is zero
    if(capacity == 0){
      return 0;
    }

    //index == length
    if(index == weight.length){
      return 0;
    }

    //capacity < weight
    if (capacity < weight[index]) {
      int ans = knapsack01Rec(weight, value, capacity, index+1);
      return ans;
    }
    //scenario 1: include me
    int ans1 = knapsack01Rec(weight, value, capacity- weight[index], index+1) + value[index];
    //scenario 2: do not include me
    int ans2 = knapsack01Rec(weight, value, capacity, index+1);

    int ans = Math.max(ans1, ans2);
    return ans;
  }

  public static int knapsack01Memoisation(int[] weight, int[] value, int capacity, int index, int[][] dp) {

    //capacity is zero
    if(capacity == 0){
      return 0;
    }

    //index == length
    if(index == weight.length){
      return 0;
    }
    int ans;
    //capacity < weight
    if (capacity < weight[index]) {
      ans = knapsack01Rec(weight, value, capacity, index+1);
      dp[index][capacity] = ans;
      return ans;
    }
    if(dp[index][capacity] != -1){
      return dp[index][capacity];
    }else{
      //scenario 1: include me
      int ans1 = knapsack01Rec(weight, value, capacity- weight[index], index+1) + value[index];
      dp[index][capacity] = ans1;
      //scenario 2: do not include me
      int ans2 = knapsack01Rec(weight, value, capacity, index+1);
      dp[index][capacity] = ans2;
      ans = Math.max(ans1, ans2);
      return ans;
    }
  }

  /*
  * samaj nhi aya tabulation(iterative)
   */
//  public static int knapsack01Iter(int[] weight, int[] value, int capacity) {
//
//    //capacity is zero
//    if(capacity == 0){
//      return 0;
//    }
//
//    int ans;
//    //capacity < weight
//    if (capacity < weight[index]) {
//      ans = knapsack01Rec(weight, value, capacity, index+1);
//      dp[index][capacity] = ans;
//      return ans;
//    }
//    if(dp[index][capacity] != -1){
//      return dp[index][capacity];
//    }else{
//      //scenario 1: include me
//      int ans1 = knapsack01Rec(weight, value, capacity- weight[index], index+1) + value[index];
//      dp[index][capacity] = ans1;
//      //scenario 2: do not include me
//      int ans2 = knapsack01Rec(weight, value, capacity, index+1);
//      dp[index][capacity] = ans2;
//      ans = Math.max(ans1, ans2);
//      return ans;
//    }
//  }
}
