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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry =0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr1!=null || curr2!=null || carry!=0){
            int digit1;
            int digit2;
            if(curr1==null){
                digit1=0;
            }else{
                digit1=curr1.val;
            }
            if(curr2==null){
                digit2=0;
            }else{
                digit2=curr2.val;
            }
            int sum = digit1+digit2+carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            if(curr1!=null)curr1=curr1.next;
            if(curr2!=null)curr2=curr2.next;
        }
        return dummy.next;
    }
}