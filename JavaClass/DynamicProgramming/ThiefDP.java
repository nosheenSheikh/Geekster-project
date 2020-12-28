package DynamicProgramming;

public class ThiefDP {

  public static void main(String[] args) {
    int[] houses = new int[]{1, 7, 1, 3, 8,2,4};
    int[] dp  =new int[houses.length];
    System.out.println(maxLootRecursive(houses, houses.length-1));
    System.out.println(maxLootMemoisation(houses, houses.length-1, dp));
    System.out.println(maxLootIter(houses));
  }

  private static int maxLootRecursive(int[] houses, int index) {
    if(index == 0) {
      return houses[0];
    }else if(index == 1) {
      return Math.max(houses[0], houses[1]);
    }else{
      return Math.max(maxLootRecursive(houses, index-1), maxLootRecursive(houses, index-2) + houses[index]);
    }
  }

  private static int maxLootMemoisation(int[] houses, int index, int[] dp) {
    if(index == 0) {
      return houses[0];
    }else if(index == 1) {
      return Math.max(houses[0], houses[1]);
    }else if(dp[index] != 0) {
      return dp[index];
    }else{
      return Math.max(maxLootMemoisation(houses, index-1, dp), maxLootMemoisation(houses, index-2, dp) + houses[index]);
    }
  }

  private static int maxLootIter(int[] houses) {
      int[] dp = new int[houses.length];
      dp[0] = houses[0];
      dp[1] = Math.max(houses[0], houses[1]);

      for(int i=2;i< houses.length;i++){
        dp[i] = Math.max(dp[i-1], dp[i-2] + houses[i]);
    }
      return dp[houses.length-1];
  }
}
