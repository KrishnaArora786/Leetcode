/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode one =headA;
        ListNode two=headB;
         HashSet<ListNode> set = new HashSet<>();
        
       while(one!=null)
       {
           set.add(one);
           one=one.next;
       }
        
        while(two!=null)
        {
            if(set.contains(two))
            {
                return two;
            }
            two=two.next;
        }
        
        return null;
    }
}