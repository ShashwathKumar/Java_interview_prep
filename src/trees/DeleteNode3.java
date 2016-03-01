package trees;
import java.util.*;

public class DeleteNode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root=null;
		
		root = Insert(root);
		printLevelOrder(root);
		
	}
	public static BTNode Insert(BTNode root){
		
		root = new BTNode(1);
		root.left = new BTNode(2);
		root.right = new BTNode(3);
		
		root.left.left   = new BTNode(4);
		root.left.right  = new BTNode(5);
		root.right.left  = new BTNode(6);
		root.right.right = new BTNode(7);

		return root;
	}
	public static void print(BTNode root){
		if(root != null){
			print(root.left);
			System.out.print(root.data+" ");
			print(root.right);
		}
	}
	public static void printLevelOrder(BTNode root){
		
		if(root == null) return;
		
		BTNode current = null;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		System.out.println(root.data);
		
		while(!q.isEmpty()){
			current = q.poll();
			System.out.print(current.data+" ");
			
			if(current.left!=null){q.offer(current.left);}
			if(current.right!=null){q.offer(current.right);}
		}
	}
}

class BTNode{
	int data;
	BTNode left;
	BTNode right;
	
	public BTNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}