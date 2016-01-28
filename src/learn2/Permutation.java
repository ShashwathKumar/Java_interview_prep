package learn2;

public class Permutation {
	final static String str1 = "Hari";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation(str1, "");
	}

	public static void permutation(String str, String prefix){
		if(str.length() == 0){
		System.out.println(prefix);
		} else {
			for(int i=0; i < str.length(); i++){
				String rem = str.substring(0,i) + str.substring(i+1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}
}
