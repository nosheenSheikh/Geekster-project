
public class LastIndex {

	public static int printLastIndex(int[] arr, int lastIndex, int target) {
		if(lastIndex == arr.length) {
			return -1;
		}
		
		int index = printLastIndex(arr, lastIndex+1, target);
		if(index != -1) {
			return index;
		}else {
			if(arr[lastIndex] == target) {
				return lastIndex;
			}else {
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,2,5,5,1};
		int index = printLastIndex(arr, 0,5);
		System.out.println(index);
	}

}
