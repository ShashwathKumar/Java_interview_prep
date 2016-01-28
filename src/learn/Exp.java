package learn;
import java.util.*;

public class Exp {

	public static final int OK = 1, SYSERR = 0, Num = 4;
	static Stack A = new Stack();
	static Stack B = new Stack();
	static Stack C = new Stack();
	static int ini = -1;
	
	static Stack src1, dest1, frnd1, src2, dest2, frnd2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init(A);
		System.out.println("After init : ");
		printStacks();
		transfer(A, C, B, Num);
		System.out.println("After transfer : ");
		printStacks();
	}
	
	static int init(Stack A){
		for(int i=Num; i>0; i--){
			A.push(i);
		}
		return OK;
	}
	
	static void transfer(Stack src, Stack dest, Stack frnd, int N){
		if(ini == -1){
			src1 = src;
			dest1 = dest;
			frnd1 = frnd;
			ini++;
		}
		
		if(N==1){
			dest.push(src.pop());
		}
		else if(N==2){
			frnd.push(src.pop());
			dest.push(src.pop());
			dest.push(frnd.pop());
		}
		else{
			src2 = src;
			dest2 = dest;
			frnd2 = frnd;
			
			Stack temp = dest;
			dest = frnd;
			frnd = temp;
			
			transfer(src, dest, frnd, N-1);
			try{dest2.push(src2.pop());}
			catch(EmptyStackException e){}
			
			src = frnd2;
			dest = dest2;
			frnd = src2;
			transfer(src, dest, frnd, N-1);
		}
	}
	
	static void printStacks(){
		System.out.println("A : " + A.toString());
		System.out.println("B : " + B.toString());
		System.out.println("C : " + C.toString());
	}

}
