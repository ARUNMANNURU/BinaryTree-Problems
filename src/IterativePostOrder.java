import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class IterativePostOrder {

	/**
	 * @param args
	 */
	 Node root;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	  
	    // An iterative function to do postorder traversal 
	    // of a given binary tree
	    ArrayList<Integer> postOrderIterative(Node node) 
	    {
	        Stack<Node> S = new Stack<Node>();
	          
	        // Check for empty tree
	        if (node == null)
	            return list;
	        S.push(node);
	        Node prev = null;
	        while (!S.isEmpty()) 
	        {
	            Node current = S.peek();
	  
	            /* go down the tree in search of a leaf an if so process it 
	            and pop stack otherwise move down */
	            if (prev == null || prev.left == current || 
	                                        prev.right == current) 
	            {
	                if (current.left != null)
	                    S.push(current.left);
	                else if (current.right != null)
	                    S.push(current.right);
	                else
	                {
	                    S.pop();
	                    list.add(current.key);
	                }
	  
	                /* go up the tree from left node, if the child is right 
	                   push it onto stack otherwise process parent and pop 
	                   stack */
	            } 
	            else if (current.left == prev) 
	            {
	                if (current.right != null)
	                    S.push(current.right);
	                else
	                {
	                    S.pop();
	                    list.add(current.key);
	                }
	                  
	                /* go up the tree from right node and after coming back
	                 from right node process parent and pop stack */
	            } 
	            else if (current.right == prev) 
	            {
	                S.pop();
	                list.add(current.key);
	            }
	  
	            prev = current;
	        }
	  
	        return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterativePostOrder tree = new IterativePostOrder();
		  
        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
  
        ArrayList<Integer> mylist = tree.postOrderIterative(tree.root);
          
        System.out.println("Post order traversal of binary tree is :");
        System.out.println(mylist);
	}

}
