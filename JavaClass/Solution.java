//import java.io.*;
import java.util.*;

public class Solution {

  public static int countSubbars(int[] arr, int n){
    int myCount = 0;
    for(int i=0;i<n;i++) {
      //possible subarrays from i to n
      for(int j=i;j<n;j++){
        int sum=0;
        //calculates the sum of elements for each subarray
        for(int k=i;k<=j;k++){
          sum = sum + arr[k];
        }
        // calculates the count of good subbars
        if(sum == n) {
          myCount = myCount + 1;
        }
      }
    }

    return myCount;
  }
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    // System.out.println(str);
    // char temp = str.charAt(0);
    // System.out.println(temp);
    int[] arr = new int[n];
    for(int i=0; i<n;i++){
      arr[i] = str.charAt(i);
    }
    System.out.println(countSubbars(arr, n));
  }
}