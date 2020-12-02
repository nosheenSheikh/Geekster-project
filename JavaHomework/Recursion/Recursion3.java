package Recursion;
import java.util.*;

public class Recursion3 {

	public static void printArray(ArrayList<Integer> subSeq, int len) {
		for(int i=0;i<len;i++) {
			System.out.print(subSeq.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void possibleSubseqOfArray(int[] arr, int idx, ArrayList<Integer> subSeq){
		
		if(idx == arr.length) {
			
			int len = subSeq.size();
			
			if(len != 0) {
				printArray(subSeq, len);
			}
		}else {
			possibleSubseqOfArray(arr, idx+1, subSeq);
			
			subSeq.add(arr[idx]);
			
			possibleSubseqOfArray(arr, idx+1, subSeq);
		}
		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3};
		ArrayList<Integer> b = new ArrayList<>();
		possibleSubseqOfArray(arr,0,b);
	}

}
