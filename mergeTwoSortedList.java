
/*

Merge two sorted (ascending) linked lists and return it as a new sorted list. 
The new sorted list should be made by splicing together the nodes of the two lists 
and sorted in ascending order.

Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null.

*/

public ListNode mergeTwoList(ListNode l1, ListNode l2){

	ListNode dummy = new ListNode(0);
	ListNode last = dummy;

	while(l1 != null && l2 != null){

		if(l1.val < l2.val){
			last.next = l1;
			l1 = l1.next;
		}else{
			last.next = l2;
			l2 = l2.next;
		}
		last = last.next;
	}

	if(l1 != null){
		last.next = l1;
	}else{
		last.next = l2;
	}

	return dummy.next;
}