package learn2;

public class triple_step {

	static class Node{
		int val;
		Node left, middle, right;
		
		Node(int val){
			this.val = val;
			this.left = this. middle = this.right = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Node root = new Node(n);
		
		triple(root);
		print(root);
	}
	
	static void triple(Node node){
		if(node.val == 0){return;}
		else{
			if(node.val>=3){
				node.left = new Node(node.val-3);
				triple(node.left);
			} else if (node.val>=2){
				node.middle = new Node(node.val-2);
				triple(node.middle);
			} else if (node.val>=1){
				node.right = new Node(node.val-1);
				triple(node.right);
			}
		}
	}
	
	static void print (Node node){
		System.out.print(node.val+" ");
		
		if(node.left == null && node.right == null && node.middle == null) return;
		else{
			if(node.left != null) print(node.left);
			if(node.middle != null) print(node.middle);
			if(node.right != null) print(node.right);
		}
	}

}
