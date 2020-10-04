package JavaClass4;

public class PatternPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=4;
		//print lines
		for(int i=1;i<=line;i++) {
			/*
			 * Print spaces.
			 * As we know spaces in first line are line-1 and will decrease by 1in each line.
			 */
			for(int j=1;j<=line-i;j++) {
				System.out.print(" ");
			}
			/*
			 * print 2*line -1 stars
			 * here we have used concept of AP 
			 * if lines are 4 then * in each line would be like this : 
			 * 1, 3, 5, 7 -> this is  an AP.
			 * And nth term of an ap can be derived from 2n-1
			 * here n is nth term
			 */
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
