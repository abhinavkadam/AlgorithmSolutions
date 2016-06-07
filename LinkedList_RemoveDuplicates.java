/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode next = head.next;
        ListNode curr = head;
       while(curr.next != null){
            
            next = curr.next;
            while(next!=null){
                if(curr.val == next.val){
                    curr.next = next.next;
                }
                next = next.next;
            }
            curr = curr.next;
            if(curr == null)
                break;
        } 
        
        return head;
    }
}