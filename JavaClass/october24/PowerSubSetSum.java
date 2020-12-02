package october24;

public class PowerSubSetSum {

	public static void subsetSum(int[] arr, int vidx, int currSum, int target, String ans) {
		//base case
		if(vidx == arr.length) {
			if(currSum == target) {
				System.out.println(ans);
			}
				return;
		}
		
		//if all elements are positive
		if(currSum > target) {
			return;
		}
		subsetSum(arr, vidx+1, currSum+ arr[vidx], target, ans + arr[vidx] + " ");
		subsetSum(arr, vidx+1, currSum, target, ans);
	}
	
	public static void subsetSum2(int[] arr, int vidx, int target, String ans) {
		//base case
		if(vidx == arr.length) {
			if(target == 0) {
				System.out.println(ans);
			}
				return;
		}
		
		//if all elements are positive
		if(target < 0) {
			return;
		}
		subsetSum2(arr, vidx+1, target- arr[vidx], ans + arr[vidx] + " ");
		subsetSum2(arr, vidx+1, target, ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{3, 34, 4, 12, 5, 2};
		subsetSum(arr, 0, 0, 9, "");
		System.out.println();
		subsetSum2(arr, 0, 9, "");
	}

}
