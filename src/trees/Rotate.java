package trees;

import java.util.*;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code to rotate an array by k times to the right
		
		Integer a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = 10, tmp;
		
		for(int i=0, j=n-k-1; i<(n-k)/2; ++i,--j){
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
		for(int i=n-k, j=n-1; i<(n - k/2); i++,j--){
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}

		for(int i=0, j=n-1; i<n/2; i++, j--){
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
		for(int i=0; i<10; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		sc.close();
	}

}
