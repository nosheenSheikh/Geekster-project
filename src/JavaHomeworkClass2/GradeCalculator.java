package HomeworkClass2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int physics = sc.nextInt();
		int maths = sc.nextInt();
		int chemistry = sc.nextInt();
		if((physics >=0 && physics<=100)&& (maths >=0 && maths<=100) 
				&& (chemistry >=0 && chemistry<=100)) {
			int average = (physics+maths+chemistry)/3;
			if(average>=90 && average<=100) {
				System.out.println("A");
			}else if(average>=80 && average<=89) {
				System.out.println("B");
			}else if(average>=70 && average<=79) {
				System.out.println("C");
			}else if(average>=60 && average<=69) {
				System.out.println("D");
			}else if(average>=0 && average<=59) {
				System.out.println("F");
			}
		}else {
			System.out.println("marks are invalid");
		}
	}

}
