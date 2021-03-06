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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode head = new ListNode(0);
        ListNode res=head;
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        ListNode one =list1;
        ListNode two=list2;
        
        while(one!=null && two!=null)
        {
            if(one.val<=two.val)
            {
               res.next=one;
                one =one.next;
                
            }else
            {
               res.next=two;
                two=two.next;
                
            }
            res=res.next;
            
        }
        
        while(one!=null)
        {
            res.next=one;
            
            one=one.next;
            res=res.next;
        }
         while(two!=null)
        {
             res.next=two;
            
            two=two.next;
            res=res.next;
            
        }
        
        return head.next;
            
    }
}