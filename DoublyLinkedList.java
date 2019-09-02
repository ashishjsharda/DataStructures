/**
 * Doubly Linked List in Java
 * @author asharda
 *
 */

//Node class
class Node
{
	int data;
	public Node(int data) {
		this.data=data;
	}
	Node prev;
	Node next;

}
public class DoublyLinkedList {

	static Node node;
	/**
	 * Insert data in linked list
	 * @param data
	 */
	public void insert(int data)
	{
		Node temp,start;
		start=node;
		if(node==null)
		{
			node=new Node(data);
			node.prev=null;
			node.next=null;
		}
		else
		{
			temp=node;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			Node newNode=new Node(data);
			newNode.prev=temp;
			temp.next=newNode;
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList d=new DoublyLinkedList();
		d.insert(10);
		d.insert(20);
		d.insert(30);
		Node previous = null;
		while(node!=null)
		{
			System.out.println(node.data);
			previous=node;
			node=node.next;
		}

		System.out.println("Previous nodes seen are ");
		while(previous!=null)
		{
			System.out.println(previous.data);
			previous=previous.prev;
		}
	}

}
