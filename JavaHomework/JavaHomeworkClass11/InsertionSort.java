package JavaHomeworkClass11;

public class InsertionSort {
	
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{28,2,12,6,1,20};
		
		int[] res = insertionSort(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

}
