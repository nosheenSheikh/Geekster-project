package Recursion;

public class Recursion2 {

	public static int findAnyIndex(int[] arr, int k, int idx) throws Exception{
		//base case
		
		if(idx == -1) {
			throw new Exception("no index found");
		}
		if(arr[idx] == k) {
			return idx;
		}
		
		int myIdx = findAnyIndex(arr, k, idx-1);
		return myIdx;
	}
	
	public static int firstOccurence(int[] arr, int k, int idx) {
		//base case
		if(idx == arr.length) {
			return -1;
		}
		
		if(arr[idx] == k) {
			return idx;
		}
		
		int myIdx = firstOccurence(arr, k, idx+1);
		return myIdx;
	}
	
	public static int lastOccurence(int[] arr, int k, int idx) {
		//base case
		if(idx == -1) {
			return -1;
		}
		
		if(arr[idx] == k) {
			return idx;
		}
		
		int myIdx = lastOccurence(arr, k, idx-1);
		return myIdx;
	}
	
	public static int maxOfArray(int[] arr, int idx, int max) {
		//base case
		if(idx == arr.length) {
			return max;
		}
		
		if(arr[idx] > max) {
			max = arr[idx];
		}
		
		int myMax = maxOfArray(arr, idx+1, max);
		return myMax;
	}
	
	public static int minOfArray(int[] arr, int idx, int min) {
		//base case
		if(idx == arr.length) {
			return min;
		}
		
		if(arr[idx] < min) {
			min = arr[idx];
		}
		
		int myMin = minOfArray(arr, idx+1, min);
		return myMin;
	}
	
	public static void printArray(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		System.out.print(arr[idx] + " ");
		printArray(arr, idx+1);
	}
	
	public static void reverseOrderOfArray(int[] arr, int idx) {
		if(idx == -1) {
			return;
		}
		System.out.print(arr[idx] + " ");
		reverseOrderOfArray(arr, idx-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3, 5, 6, 3, 6, 3, 3, 4, 1, 3, 4};
		int k = 6;
		
//		int idxRes = findAnyIndex(arr, k, arr.length-1);
//		System.out.println(idxRes);
		
//		int firstIdx = firstOccurence(arr, k,0);
//		System.out.println(firstIdx);
		
//		int lastIdx = lastOccurence(arr, k, arr.length-1);
//		System.out.println(lastIdx);
		
//		int max = maxOfArray(arr, 0, arr[0]);
//		System.out.println(max);
		
//		int min = minOfArray(arr, 0, arr[0]);
//		System.out.println(min);
		
//		printArray(arr,0);
		
		reverseOrderOfArray(arr, arr.length-1);
	}

}
