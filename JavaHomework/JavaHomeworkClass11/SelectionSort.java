package JavaHomeworkClass11;

public class SelectionSort {

	
	public static int[] selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int minidx = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j] < min) {
					min = arr[j];
					minidx = j;
				}
			}
			//swap the min element with position 
			int temp = arr[minidx];
			arr[minidx] = arr[i];
			arr[i]  = temp; 
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{28,2,12,6,1,20,1, 250,123};
		
		int[] res = selectionSort(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

}
