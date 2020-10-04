package JavaClass2;
import java.util.Scanner;

public class RemainderWithThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%3==0) {
			System.out.println("zero");
		}else if(num%3==1) {
			System.out.println("one");
		}else {
			System.out.println("two");
		}
	}

}
