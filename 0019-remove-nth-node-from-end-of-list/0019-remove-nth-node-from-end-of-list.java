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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int ind = 1;
        ListNode curr = head;
        while(curr!=null){
            ind++;
            curr=curr.next;
        }
        int rem = ind-n;
        curr=head;
        int i=1;
        ListNode prev=null;
        if(rem==1)return head.next;
        while(i!=rem){
            prev=curr;
            curr=curr.next;
            i++;
        }
        if(curr.next!=null)prev.next=curr.next;
        else prev.next=null;
        return head;
    }
}