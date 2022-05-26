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
    public int getDecimalValue(ListNode head) {
        
        Stack<Integer> stk =new Stack<>();
		int sum=0;
		int i=0;
		
		ListNode curr=head;
		
		while(curr!=null)
		{
			stk.push(curr.val);
			curr=curr.next;
			
		}
		
		while(stk.isEmpty()==false)
		{
			
			sum+=stk.pop()*Math.pow(2, i++);
		}
		return sum;
        
    }
}