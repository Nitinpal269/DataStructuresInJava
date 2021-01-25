package com.TimeComplexity;

public class SinglyLinkInsertEnd {
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current=head;
		while(null!=current.next) {
			current=current.next;
		}
		current.next=newNode;
	}
	public static void main(String[] args) {
		SinglyLinkInsertEnd sll=new SinglyLinkInsertEnd();
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		sll.display();
	}

}
