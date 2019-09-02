/**
 * Trees in Java 
 * @author asharda
 *
 */

//Node Class
class Node
{
	int data;
	Node(int data)
	{
		this.data=data;
	}
	Node left;
	Node right;
}
public class Trees {

	
	/**
	 * Inorder Tree Traversal
	 * @param node
	 */
	public void inorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
	}
	public static void main(String[] args) {
	
		Trees tree=new Trees();
		Node node=new Node(3);
		node.left=new Node(1);
		node.right=new Node(5);
		tree.inorder(node);
	}

}
