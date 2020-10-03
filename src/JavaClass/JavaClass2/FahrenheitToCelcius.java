import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		double tocelcius = (5.0/9) * (f-32);
		System.out.println("farhenheit to celcius: "+tocelcius);
	}

}
