package codelab_fb;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		int k=0;
		
		for(int i=0; i<3; i++){
			A.add(new ArrayList<Integer>());
			
			for(int j=0; j<4; j++){
				A.get(i).add(++k);
			}
			}
			//printing it
		
			B = performOps(A);
		
			for(int i=0; i<B.size(); i++){
				for(int j=0; j<4; j++){
					System.out.print(B.get(i).get(j)+" ");
				}
			}
			
			static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A){
				ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>(A);
				
				return B;
			}
		
	}

}