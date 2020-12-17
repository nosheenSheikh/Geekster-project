package DynamicProgramming;

public class Staircase {

  //Recursion
  public static int myStaircase(int n) {
    if(n == 0 || n==1){
      return 1;
    }else if(n==2){
      return 2;
    }
    return myStaircase(n-1) + myStaircase(n-2)  + myStaircase(n-3);
  }

  // memoisation
  public static int myStaircase(int n, int[] dp) {
    if(n == 0 || n==1){
      return 1;
    }else if(n==2){
      return 2;
    }else if(dp[n] !=0){
      return dp[n];
    }else{
      int temp = myStaircase(n-1, dp) + myStaircase(n-2, dp)  + myStaircase(n-3, dp);
      dp[n] = temp;
      return dp[n];
    }

  }

  //iterative
  public static int myStaircaseIter(int n) {
    int[] dp = new int[n+3];
    dp[0] = 1;
    dp[1] = 1;
    dp[2] = 2;
    for (int i=3;i<=n;i++) {
        dp[i] = dp[i-1]  + dp[i-2] + dp[i-3];
      }
    return dp[n];
  }

  public static void main(String[] args) {
    int[] dp = new int[100];
    System.out.print(myStaircase(4) + "\n");
    System.out.print(myStaircase(4, dp) + "\n");
    System.out.print(myStaircaseIter(4) + "\n");
  }
}
