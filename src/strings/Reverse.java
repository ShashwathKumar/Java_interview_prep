package strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Hari";
		System.out.println("Original: "+st);
		/*
		String rev = reverse(st);
		System.out.println("reverse: "+rev);
		
		String revNoTmp = reverseNoTmp(st);
		System.out.println("reverse: "+revNoTmp);
		*/
		String revXOR = reverseXor(st);
		System.out.println("reverse: "+revXOR);		
	}
	
	public static String reverse(String st){
		int len = st.length();
		char tmp;
		char[] str=st.toCharArray();
		
		for(int i=0, j=len-1; i<len/2; i++, j--){
			tmp = str[i];
			str[i] = str[j];
			str[j] = tmp;
		}
		
		st = String.valueOf(str);
		return st;
	}
	
	public static String reverseNoTmp(String st){
		
		int len = st.length();
		StringBuilder str = new StringBuilder(len);
		
		for(int i=len-1; i>=0; i--){
			str.append(st.charAt(i));
		}
		st = String.valueOf(str);
		return st;
	}
	public static String reverseXor(String st){
		int len=st.length();
		char[] str = st.toCharArray();
		
		for(int i=0, j=len-1; i<len/2; i++, j--){
			str[i] = (char)(str[i]^str[j]);
			str[j] = (char)(str[i]^str[j]);
			str[i] = (char)(str[i]^str[j]);
		}
		st = String.valueOf(str);
		return st;
	}

}
