package learn2;

public class triple_step_simple {

	static class Node{
		int val;
		Node left, right, middle;
		
		Node(int val){
			this.val = val;
			this.left = this.right = this.middle = null;
		}
	}
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 10;
		Node root = new Node(0);
		triple(root);
	}
	
	static void triple(Node node){
		
	}

}
