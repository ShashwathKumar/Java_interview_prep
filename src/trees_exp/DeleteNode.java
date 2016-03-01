package trees_exp;
import java.util.*;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTNode root = null;
		
		for(int i=0; i<10; i++){
			System.out.println("\nIteration"+i);
			root = Insert(root, i);
		}
	}
	public static BTNode Insert(BTNode root, int value){
		
		BTNode NewNode = new BTNode(value);
		//System.out.print(value);
		
		if(root == null){
			root = NewNode;
			return root;
		}
		
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.offer(root);
		BTNode current = null;
		System.out.println("root: "+root.getData()+" ");
		
		while(!q.isEmpty()){
			current = q.poll();
			System.out.print(current.getData()+" ");
			
			if(current.getLeft()==null){	current.setLeft(NewNode); return root;	}
			else { q.offer(current.getLeft());}
			
			if(current.getRight()==null){	current.setRight(NewNode); return root;}
			else { q.offer(current.getRight());}
		}
		return root;
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

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}
	
}