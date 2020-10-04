package JavaClass4;

public class NCR {

	static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*num;
		}
		return fact;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,r=2,factn=1,factr=1, factn_r=1;
		int ncr;
		 factn = factorial(n);
		 factr = factorial(r);
		 factn_r = factorial(n-r);
		 ncr = factn/(factr*factn_r);
		 System.out.println(ncr);
}
}

