package Recursion;

public class Recursion1 {

	public static void decreasingNumbers(int num) {
		if(num == 0) {
			return;
		}
		
		System.out.println(num);
		decreasingNumbers(num-1);
	}
	
	public static void increasingNumbers(int num) {
		if(num == 0) {
			return;
		}
		
		increasingNumbers(num-1);
		System.out.println(num);
	}
	
	public static int factorial(int num) {
		if(num == 0 || num ==1) {
			return 1;
		}
		
		int fact = num * factorial(num-1);
		return fact;
	}
	
	public static int fibonacci(int num) {
		if(num == 1) {
			return 0;
		}
		if(num ==2) {
			return 1;
		}
		int fibnm1 = fibonacci(num-1);
		int fibnm2 = fibonacci(num-2);
		int currFib = fibnm1 + fibnm2;
		return currFib;
	}
	
	public static void incDec(int num) {
		increasingNumbers(num);
		decreasingNumbers(num);
	}
	
	public static int power(int num, int pow) {
		
		if(pow ==0) {
			return 1;
		}
		
		if(pow == 1) {
			return num;
		}
		
		int powby2 = power(num, pow/2);
		
		if(pow%2 == 0) {
			return powby2 * powby2;
		}else {
			return powby2 * powby2 * num;
		}
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		decreasingNumbers(10);
		
//		increasingNumbers(5);
		
//		int factRes = factorial(5);
//		System.out.println(factRes);
		
//		int fibRes = fibonacci(8);
//		System.out.println(myFib);
		
//		incDec(5);
		
//		int powRes = power(2, 10);
//		System.out.println(powRes);
		
		
	}

}
