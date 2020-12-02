package JavaHomeworkClass11;

public class BubbleSort {

	public static int[] bubbleSort(int[] myArr) {
		
		// for each pass
		for(int i=0;i<myArr.length-1;i++) {
			// iterate through each element of array till length-2 index
			for(int j=0;j< (myArr.length-i)-1;j++) {
				if(myArr[j] > myArr[j+1]) {
					//swap
					System.out.println("swap");
					int temp = myArr[j];
					myArr[j] = myArr[j+1];
					myArr[j+1] = temp;
				}
			}
		}
		return myArr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{28,2,12,6,1,20};
		
		int[] res = bubbleSort(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

}
