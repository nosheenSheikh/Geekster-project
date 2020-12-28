package PatternMatch;

public class KMP {

  public static void main(String[] args){
    String str = "aabaacaabaad";
    String pattern = "#";
    String myString = pattern + "#" + str;
    int[] res = LPS(myString);
    for (int lps : res){
      System.out.print(lps+ " ");
    }

    int count =0;
    for (int lps: res){
      if (lps == pattern.length()){
        count++;
      }
    }
    System.out.println();
    System.out.print("no of times pattern occurs in str:" + count);
  }

  public static int[] LPS(String str){
    int[] arr = new int[str.length()];

    arr[0] = 0;
    int len = 0;  // len is arr[i-1] i.e. lps at i-1

    int i=1;

    while(i < str.length()){
      if (str.charAt(i) == str.charAt(len)){
        len++;
        arr[i] = len;
        i++;
      }else{
        if (len != 0){
          len = arr[len-1];
        }else{
          arr[i] = len;
          i++;
        }
      }
    }
    return arr;
  }
}
