package strings;

import java.util.*;

public class permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "AABC";
		List<String> permutes = permutation(st);
		
	}
	public static List<String> permutation(String st){
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		List<String> permutes = null;
		
		hm = chCount(st);
		System.out.println("HashMap: "+hm);
		
		return permutes;
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
