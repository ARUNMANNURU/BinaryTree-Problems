import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	static Node root;
	 
    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder() 
    {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal tree_level = new LevelOrderTraversal();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	        
	        /*
	         * 				1
	         * 			2		3
	         * 		4		5
	         * 
	         */
	        System.out.println("Level order traversal of binary tree is - ");
	        tree_level.printLevelOrder();
	}

}
