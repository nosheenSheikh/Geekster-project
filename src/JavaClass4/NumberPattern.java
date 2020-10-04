package JavaClass4;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int line = 5;
		for(int i=0;i<5;i++) {
			//print number
			int j=0;
			while(j< i+1) {
				System.out.print(num + " ");
				num++;
				j++;
			}
			System.out.println();
		}
	}

}
