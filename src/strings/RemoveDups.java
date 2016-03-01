package strings;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "hharri";
		System.out.println("Original string: "+st);
		/*String NoDups = RemoveDups(st);
		System.out.println("Duplicates removed: "+NoDups);*/
		String NoBldr = NoBuilder(st);
		System.out.println("No Builder: "+NoBldr);
	}
	public static String RemoveDups(String st){
		int len = st.length();
		StringBuilder str = new StringBuilder();
		
		str.append(st.charAt(0));
		char prev = st.charAt(0);
		char curr;
		
		for(int i=1; i<len; i++){
			curr = st.charAt(i);
			if(curr != prev) str.append(curr);
			prev = curr;
		}
		
		st = String.valueOf(str);
		return st;
	}
	public static String NoBuilder(String st){
		int len = st.length();
		char[] str = new char[len];
		char prev = str[0] = st.charAt(0);
		char curr;
		int j=1;
		
		for(int i=1; i<len; i++){
			curr = st.charAt(i);
			if(prev != curr){
				str[j++] = curr;
			}
			prev = curr;
		}
		st = String.valueOf(str);
		
		System.out.print("From func: ");
		for(int i=0; i<len; i++) if(str[i]!='\u0000')System.out.print(str[i]);
		System.out.println();
		return st;
	}

}
