import java.util.Scanner;

public class October13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int[] arr3 = new int[n1+n2];
		int p1=0,p2=0,p3=0;
		for(int in1=0;in1<arr1.length;in1++) {
			arr1[in1] = sc.nextInt();
		}
		for(int in2=0;in2<arr1.length;in2++) {
			arr2[in2] = sc.nextInt();
		}
		
		while(p1 < arr1.length && p2 < arr2.length) {
			System.out.println("enters1");
			if(arr1[p1] < arr2[p2]) {
				arr3[p3] = arr1[p1];
				p1++;
				p3++;
			}else {
				arr3[p3] = arr2[p2];
				p2++;
				p3++;
			}
		}
		
		while(p1< arr1.length) {
			System.out.println("enters2");
			arr3[p3] = arr1[p1];
			p1++;
			p3++;
		}
		
		while(p2 < arr2.length) {
			System.out.println("enters3");
			arr3[p3] = arr2[p2];
			p2++;
			p3++;
		}
		
		for(int val: arr3) {
			System.out.print(val + " ");
		}
	}

}
