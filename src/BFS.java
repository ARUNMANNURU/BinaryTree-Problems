import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class BFS {

	/**
	 * @param args
	 */
	
	static Node root = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFS bTraversal = new BFS();
		bTraversal.root = new Node(1);
		bTraversal.root.left = new Node(2);
		bTraversal.root.right = new Node(3);
		bTraversal.root.left.left = new Node(4);
		bTraversal.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		bTraversal.printLevelOrder();
	
	}
	static void printLevelOrder(){
		
		/* Given a binary tree. Print its nodes in level order
	     using array for implementing queue  */
	        Queue<Node> queue = new LinkedList<Node>();
	        queue.add(root);
	        while (!queue.isEmpty()) 
	        {
	 
	            /* poll() removes the present head.
	            For more information on poll() visit 
	            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
	            Node tempNode = queue.poll();
	            System.out.print(tempNode.key + " ");
	 
	            /*Enqueue left child */
	            if (tempNode.left != null) {
	                queue.add(tempNode.left);
	            }
	 
	            /*Enqueue right child */
	            if (tempNode.right != null) {
	                queue.add(tempNode.right);
	            }
	        }	
	}
}
