/**
 * Node class
 * @author asharda
 *
 */
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}
/**
 * Stacl Class
 * @author asharda
 *
 */

public class Stack {

	Node top;
	/**
	 * Push elements into node.
	 * @param node
	 */
	public void push(Node node)
	{
		Node newNode;
		if(top==null)
		{
			top=node;
			top.next=null;
		}
		else
		{
			node.next=top;
			top=node;
		}
	}

	/**
	 * Pop the node.
	 * @return Node
	 */
	public Node pop()
	{
		if(top==null)
		{
			return null;
		}
		else
		{
			top=top.next;
		}
		return top;
	}

	/**
	 * Display the stack
	 */
	public void display()
	{
		while(top!=null)
		{
			System.out.println(top.data);
			top=top.next;
		}
	}

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(new Node(5));
		stack.push(new Node(2));
		stack.push(new Node(3));
		stack.display();
		stack.push(new Node(10));
		stack.push(new Node(20));
		System.out.println(stack.pop().data);
		stack.display();


	}

}
