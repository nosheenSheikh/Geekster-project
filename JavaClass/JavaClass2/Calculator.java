package JavaClass2;

//date : 4 October 10-12

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 20;
		char operator = '+';
		if(operator == '+') {
			System.out.println(n1 + n2);
		}else if(operator == '-'){
			System.out.println(n1 -n2);
		}else if(operator == '/'){
			System.out.println(n1 /n2);
		}else if(operator == '*'){
			System.out.println(n1 *n2);
		}
	}

}
