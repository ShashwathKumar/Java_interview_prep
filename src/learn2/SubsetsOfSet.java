package learn2;

import java.util.*;

public class SubsetsOfSet {

	static Set<Integer> set = new HashSet<Integer>();
	static int count, size, index, firstLove =1;
	static ArrayList<Integer> vals = new ArrayList<Integer>();
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getSet();
		printSubsets();
	}

	public static void getSet(){
		/*char choice = 'n';
		int newVal;
		//System.out.println("Please enter the values of set");
		Scanner in = new Scanner(System.in);
		
		try{
			do{
				System.out.println("Please enter an element for the set :");
				newVal = in.nextInt();
				set.add(newVal);
				System.out.println("Would you like to enter more elements ?!  ");
				//choice = (char) in.nextInt();
				choice = in.next().charAt(0);
			}while(choice == 'y' || choice == 'Y');
		} catch(Exception e){
				System.out.println("Something went wrong..!! exiting..!!");
				System.exit(0);
		}finally{
				in.close();
		}*/
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
	}
	
	public static void printSubsets(){
		if(firstLove == 1){
			count = 1;
			index = 0;
			size = set.size();
			firstLove = 0;
			
			Iterator iter = set.iterator();
			while(iter.hasNext()){
				vals.add((int)iter.next());
			}
			
			/*for debugging
			System.out.println("Chalo started..!!");
			System.out.println("count = "+count);
			System.out.println("index = "+index);
			System.out.println("size = "+size);
			System.out.println("firstLove = "+firstLove);*/
			
			/*Iterator it = vals.iterator();
			while(it.hasNext())
				System.out.print(it.next()+" ");
			
			System.out.println();*/
		}
		
		if(index + count <= size){
			try{
				for(int i=index; i<index+count; i++){
					System.out.print(vals.get(i)+" ");
				}
				System.out.println("");
				index++;
				//for debugging
				//System.out.println(index);
				printSubsets();
			}catch(IndexOutOfBoundsException e){
				System.out.println("Out of Bounds..!! Exiting..!!");
				System.exit(0);
			}
		}
		else if (count <= size) {
			count++;
			index=0;
			printSubsets();
		}
	}
	
}
