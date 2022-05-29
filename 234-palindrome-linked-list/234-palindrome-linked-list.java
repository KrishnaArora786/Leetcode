/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    
    public ListNode reverse(ListNode head)
	{
		if(head==null)return null;
		ListNode curr=head;
		ListNode prev=null;
		ListNode Next=head;
		while(curr!=null)
			
		{
			Next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=Next;
			
		
		}
		return prev;
	}
    public boolean isPalindrome(ListNode head) {
        
       if(head==null)return false;
			
			ListNode slow=head;
			ListNode fast=head;
			ListNode start=head;
			while(fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			
			ListNode middle=reverse(slow);
			
			
			while(start!=null && middle!=null)
			{
				if(start.val!=middle.val)
				{
					return false;
				}
				start=start.next;
				middle=middle.next;
				
			}
			return true;
        
    }
}