package strings;

import java.util.*;

public class permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "AABC";
		List<String> permutations = permutation(st);
		
	}
	public static List<String> permutation(String st){
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		List<String> permutations = null;
		
		hm = chCount(st);
		System.out.println("HashMap: "+hm);
		
		Set s = hm.entrySet();
		Iterator<HashMap.Entry> it = s.iterator();
		
		permutations = permutes(it, permutations);
		return permutations;
	}
	public static List<String> permutes(Iterator<HashMap.Entry> it, List<String> lPermutations){
		HashMap.Entry entry;
		int cntr;
		
		
		while(it.hasNext()){
			entry = it.next();
			cntr = (int)entry.getValue();
			
			if(cntr!=0){
				
			}
		}
		
		return lPermutations;
	}
	public static HashMap<Character,Integer> chCount(String st){
		HashMap<Character,Integer> lHm = new HashMap<Character, Integer>();
		int cnt;
		
		for(char item: st.toCharArray()){
			if(lHm.containsKey(item)){
				cnt = lHm.get(item);
				lHm.put(item, ++cnt);
			}else{
				lHm.put(item,1);
			}
		}	
		return lHm;
	}
	
}
