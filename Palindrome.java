
package com.webdriver.ltree.pages;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Palindrome Linked List
 * @author asharda
 */

//ListNode class
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class Palindrome {


	/**
	 * Check if LinkedList is Palindrome
	 * @param head
	 * @return boolean
	 */
	public boolean isPalindrome(ListNode head) {
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		while(head!=null)
		{
			list.add(head.val);
			head=head.next;
		}

		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int i=list.size()-1;i>=0;i--)
		{
			list2.add(list.get(i));
		}
		if(list.equals(list2))
		{
			return true;
		}

		return false;
	} 
	public static void main(String[] args) {
		ListNode node=new ListNode(1);
		node.next=new ListNode(2);
		node.next.next=new ListNode(1);
		Palindrome p=new Palindrome();
		//p.isPalindrome(node);
		System.out.println(p.isPalindrome(node));
	}

}
