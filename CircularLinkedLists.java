package LinkedLists;

//Node class
class Node
{
	int data;
	public Node(int data) {
		this.data=data;
	}
	Node next;

}

/**
 * Circular Linked Lists
 * @author asharda
 *
 */
public class CircularLinkedLists {

	static Node node;

	/**
	 * Insert data
	 * @param data
	 */
	public void insert(int data)
	{
		Node newNode;
		Node temp = null;
		Node start;
		start=node;
		if(node==null)
		{
			node=new Node(data);
			node.next=null;
		}
		else
		{
			temp=node;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			newNode=new Node(data);
			temp.next=newNode;
		}

	}

	/**
	 * Turn singly linked list to circular
	 */
	public void turnCircular()
	{
		Node start=node;
		Node head=node;
		while(head.next!=null)
		{
			head=head.next;
		}
		head.next=node;
	}
	public static void main(String[] args) {
		CircularLinkedLists lists=new CircularLinkedLists();
		lists.insert(2);
		lists.insert(4);
		lists.insert(6);
		lists.insert(8);
		lists.turnCircular();
		Node start=node;
		Node temp=node;
		while(temp.next!=start)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

}
