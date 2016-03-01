package strings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "I am Shashwath Kumar";
		System.out.println("Original sentence: "+st);
		String rev = ReverseWords(st);
		System.out.println("Words reversed: "+rev);
		String rev2 = ReverseBuilder(st);
		System.out.println("Reversed with Builder: "+rev2);
	}
	public static String ReverseWords(String st){
		String[] words = st.split(" ");
		int len = words.length;
		String str="";
		
		for(String eachWord: words){
			str = eachWord +" "+ str;
		}
		
		return str;
	}
	public static String ReverseBuilder(String st){
		String[] words = st.split(" ");
		int len = words.length;
		StringBuilder str = new StringBuilder();
		
		for(int i=len-1; i>=0; i--){
			str.append(words[i]);
			if(i!=0) str.append(" ");
		}
		
		st = String.valueOf(str);
		return st;
		
	}
}
