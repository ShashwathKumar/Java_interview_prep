package learn2;

import java.util.*;

public class SubsetsOfSet {

	static Set<Integer> set = new HashSet<Integer>();
	static int count, size, index, firstLove =1, counter;
	static ArrayList<Integer> vals = new ArrayList<Integer>();
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSet();
		printSubsets();
	}

	public static void getSet(){
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
	}
	
	public static void printSubsets(){
		if(firstLove == 1){
			count = 1;
			size = set.size();
			firstLove = 0;
			
			Iterator iter = set.iterator();
			while(iter.hasNext()){
				vals.add((int)iter.next());
			}
		}
		
		if(count <= size) {
			printNums(count++, 0);
			printSubsets();
		}

	}
	
	public static void printNums(int lcount, int index){
		if(lcount>0){
			for(int i=index; i<=size-lcount; i++){
				for(int j=0; j<count; j++) 
				System.out.print(vals.get(i)+" "+"["+lcount+","+index+"]");
				printNums(lcount-1, i+1);
				//if(index == 0) System.out.println();
			}
		}
		else{
			System.out.println();
		}
	}
	
}
