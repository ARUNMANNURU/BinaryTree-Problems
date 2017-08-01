/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class DeleteTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteTree tree = new DeleteTree();
		  
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	  
	        /* Print all root-to-leaf paths of the input tree */
	        tree.deleteTree(tree.root);
	        tree.root = null;
	}
	 static Node root;
	  
	    /*  This function traverses tree in post order to 
	        to delete each and every node of the tree */
	   static void deleteTree(Node node) 
	    {
	        if (node == null)
	            return;
	  
	        /* first delete both subtrees */
	        deleteTree(node.left);
	        deleteTree(node.right);
	  
	        /* then delete the node */
	        System.out.println("The deleted node is " + node.key);
	        node = null;
	    }
	  

}
