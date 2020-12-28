package DynamicProgramming;

public class NoOfPathsFromSrcToDest {

  public static int countPathRec(int x, int y){
    if(x == 0 || y == 0) {
      return 1;
    }else if(x < 0 || y < 0){
      return 0;
    }else{
      return countPathRec(x-1,y) + countPathRec(x, y-1);
    }
  }

  public static int countPathMemoisation(int x, int y, int[][] dp){
    if(x == 0 || y == 0) {
      return 1;
    }else if(x < 0 || y < 0){
      return 0;
    }else if(dp[x][y] != 0) {
      return dp[x][y];
    }else {
      return countPathMemoisation(x-1,y, dp) + countPathMemoisation(x, y-1, dp);
    }
  }

  public static int countPathIter(int x, int y){
    if(x == 0 || y == 0) {
      return 1;
    }
    int[][] dp = new int[100][100];
    for(int j=0;j<=y;j++){
      dp[0][j] = 1;
    }

    for(int i=0;i<=x;i++){
      dp[i][0] = 1;
    }

    for(int i= 1;i<=x;i++){
      for(int j= 1;j<=y;j++){
        dp[i][j] = dp[i-1][j] + dp[i][j-1];
      }
    }
    return dp[x][y];
  }

  public static void main(String[] args){
    int[][] dp = new int[4][4];
    System.out.println(countPathRec(3,3));
    System.out.println(countPathMemoisation(3,3, dp));
    System.out.println(countPathIter(3,3));
  }
}
