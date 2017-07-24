import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class BalancedTree {

	/**
	 * @param args
	 */
	/*
	 * Check whether a given Binary tree is Balanced or not
	 * 
	 * 
	 * 
	 * 
	 */
	
	static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Let us construct the following Binary Tree 
		 * which is not a complete Binary Tree
		 * 
		 * 			1
		 * 		2		3
		 * 	4		5		6
		 * 
		 */
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);	
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		if(isCompleteBT(root) == true)
			System.out.println("Complete Binary Tree:");
		else
			System.out.println("Not a complete Binary Tree");
		
	}
	/*
	 * Given a binary tree, return true or false 
	 * 
	 */
	static boolean isCompleteBT(Node root){
		
		//Base Case : An empty tree is complete Binary tree
		if(root == null)
			return true;
		
		// Create an Empty queue
		Queue<Node> queue = new LinkedList<Node>();
		
		// Create a flag variable which will be set true
		// when a non full node is seen
		
		boolean flag = false;
		
		/* Do level order traversal */
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node temp_node = queue.remove();
			
			/*Check if left child is present */
			if(temp_node.left != null){
				/*If we have seen a non full node, and we see a node
				 * with non-empty left child, then the given tree is not  a complete BT*/
				if(flag == true)
					return false;
				// Enqueue left child
				queue.add(temp_node.left);
			}
			// if this is a non-full node, set the flag to false
			else 
				flag = true;
			/* Check if right child is present*/
			if(temp_node.right != null){
				/*
				 * If we have seen a non full node and we see a node
				 * with a non-empty right child, then the given tree is not
				 * BT
				 */
				if(flag == true)
					return false;
				// Enqueue right child
				queue.add(temp_node.right);
			}
			// If this a non-full node, set the flag as true
			return true;
		}
		
		return false;
	}
}
