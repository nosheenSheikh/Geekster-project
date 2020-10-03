package HomeworkClass2;
import java.lang.Math;
import java.util.Scanner;
public class AbsoluteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num = sc.nextInt();
		System.out.println("Absolute of the number "+ Math.abs(num));
		if(num < 0) {
			System.out.println("Absolute of the number by multiplying with -1:" + num * -1);
		}else {
			System.out.println("\"Absolute of the even number remains same: "+num);
		}
	}

}
