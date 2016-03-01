package learn;

import java.util.Arrays;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2, 4, 3, 7, 6, 5, 1};
		insertion_sorto(A);
		System.out.println("Sorted array"+A);
	}
	
	public static int[] insertion_sorto(int[] A){
		if(A.length == 0) return A;
		else return insert(A[0], insertion_sorto(Arrays.copyOfRange(A, 1, A.length)));
	}
	
	public static int[] insert(int f,int[] A){
		if(A.length == 0) {
			int A2[]={f};
			return A2;
		} else if(f<=A[0]){
			int A2[] = new int[A.length + 1];
			System.arraycopy(f, 0, A2, 0, 1);
			System.arraycopy(A, 0, A2, 1, A.length);
			return A2;
		}else{
			int A2[] = new int[A.length + 1];
			System.arraycopy(A[0], 0, A2, 0, 1);
			System.arraycopy(insert(f, Arrays.copyOfRange(A, 1, A.length-1)), 0, A2, 1, A.length);
			return A2;
		}
	}
}
