package com;

import java.util.Stack;

/*
 * 
	Reverse Second Half of Linked List 
 */

class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
		this.next = null;
	}
}
public class Test {

	
	public static ListNode reverseHalf(ListNode head){
		if(head == null || head.next == null) return head;
		
		ListNode slow = head, fast = head;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		} // find the middle
		
		ListNode cur = slow.next; 
		ListNode pre = null;
		while(cur != null){   // reverse 
			ListNode nxt = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nxt;
		}
		slow.next = pre;
		return head;
	}
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		ListNode res = reverseHalf(l1) ;
		
		ListNode n = l1;
		while(n != null){
			System.out.println(n.val);
			n = n.next;
		}
	}

}
