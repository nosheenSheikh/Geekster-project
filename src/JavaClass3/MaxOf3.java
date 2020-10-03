package Class3;

import java.util.Scanner;

public class MaxOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1);
		}else if(n2>n3) {
			System.out.println(n2);
		}else {
			System.out.println(n3);
		}
	}

}
