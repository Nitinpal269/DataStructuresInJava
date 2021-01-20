package com.TimeComplexity;

public class SinglyLinkFindLength {
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	//display LinkedList Element
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
		}
	//find length of LinkList
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	public static void main(String[] args) {
		SinglyLinkFindLength sll=new SinglyLinkFindLength();
		//add node in the list
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		sll.display();
		System.out.println("Length is "+sll.length());
	}
		
}
