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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(), sumNode = dummy, node = head.next;
        for(int sum = 0; node != null; node = node.next)
            if(node.val == 0){
                sumNode.next = new ListNode(sum);
                sumNode = sumNode.next;
                sum = 0;
            }else sum += node.val;
        return dummy.next;
        
    }
}