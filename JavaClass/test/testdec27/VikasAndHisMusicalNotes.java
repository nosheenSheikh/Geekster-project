package test.testdec27;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class VikasAndHisMusicalNotes {

  public static int countSubStrings(String orig, String ques, BigInteger P, String ans) {
    if(ques.equals("") && !ans.equals("")) {
      if(orig.contains(ans)){
//        System.out.println(ans);
        BigInteger temp = new BigInteger(ans);
        String zero = "0";
        BigInteger zeroTemp = new BigInteger(zero);
        if(temp.mod(P).equals(zeroTemp)){
          System.out.println("temp"+ temp);
          return 1;
        }else{
          return 0;
        }
      }else{
        return 0;
      }
    }else if (ques.equals("")){
      return 0;
    }

    int ans1  = countSubStrings(orig, ques.substring(1), P, ans + ques.charAt(0));
    int ans2 = countSubStrings(orig, ques.substring(1), P, ans);

    return ans1+ans2;
  }

  // 33883322005544116655
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger P = sc.nextBigInteger();
    // BigInteger P1 = new BigInteger(P);
    String str = sc.next();
    System.out.println("----");
    System.out.println(countSubStrings(str, str, P, ""));
  }
}