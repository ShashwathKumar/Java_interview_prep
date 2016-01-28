package learn;

public class Bin_search {

	static final int a[] = {1, 2, 3, 4, 6, 6, 8, 9, 10, 11};
	static int num =0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(bin_search(3, 0, 9));
		//System.out.println(bin_search_first(6, 0, 9));
		//System.out.println(bin_search_last(6, 0, 9));
		
		bin_search_no_of_ele(6, 0 , 9);
		System.out.println(num);
	}
	
	public static int bin_search(int e, int big, int end){
		int mid_index;
		
		if((end + big)%2 == 0) mid_index= (end + big)/2;
		else mid_index = (end + big + 1)/2;
		
		if(a[mid_index] == e) { return mid_index;}
		else if (end - big <= 1) {return -1;}
		else if (a[mid_index] > e) return bin_search(e, big, mid_index-1);
		else return bin_search(e, mid_index+1, end);
	}
	
	public static int bin_search_first(int e, int big, int end){
		int mid_index;
		mid_index = (end + big)/2; //understand the tendency to go left
		
		if (big == end){ if(a[mid_index]==e) return mid_index; else return -1;}
		else if(a[mid_index]<e) return bin_search_first(e, mid_index+1, end);
		else return bin_search_first(e, big, mid_index);
	}
	
	public static int bin_search_last(int e, int big, int end){
		int mid_index;
		mid_index = (end + big + 1)/2; //understand the tendency to go right
		
		if (big == end){ if(a[mid_index]==e) return mid_index; else return -1;}
		else if(a[mid_index]>e) return bin_search_last(e, big, mid_index-1);
		else return  bin_search_last(e, mid_index, end);
	}
	
	public static void bin_search_no_of_ele(int e, int big, int end){
		int mid_index;
		mid_index = (end + big + 1)/2;
		
		if(big == end) { if(a[mid_index] == e) num++;}
		else{
			if(e > a[mid_index-1]) bin_search_no_of_ele(e, mid_index, end);
			if(e < a[mid_index])   bin_search_no_of_ele(e, big, mid_index-1);
		}
	}
}
