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
    
	public static ListNode reverse(ListNode head)
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
    public int pairSum(ListNode head) {
        
        
        
		if(head==null) return 0;
		ListNode slow=head;
		ListNode fast=head;
		ListNode start=head;
		int sum=0;
		int maxi=Integer.MIN_VALUE;
        if(start.next.next==null)
        {
            return start.val+start.next.val;
        }
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		ListNode rev=reverse(slow);
		
		
		while(rev!=null)
		{
			sum=start.val+rev.val;
			maxi=Math.max(maxi, sum);
			start=start.next;
			rev=rev.next;
			
		}
		
		return maxi;
        
    }
}