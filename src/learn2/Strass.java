package learn2;
import java.lang.Math;

public class Strass {

	static double x, y, n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<200; i++){
			n = i;
			x = Math.log(n)/Math.log(2);
			y = (3*n*n*n) + (6*n*n) - (8*Math.pow(7,x));
			//System.out.println(y);
			System.out.println(n+"   "+y);
			//System.out.println(Math.pow(3, 2));
		}
		
	}

}
