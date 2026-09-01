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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> st = new ArrayList<>();
        ListNode slow=head;
        while(slow!=null){
            st.add(slow.val);
            slow=slow.next;
        }
        int l=0,r=st.size()-1;
        while(l<r){
            if(st.get(l)!=st.get(r))return false;
            l++;
            r--;
        }
        return true;
    }
}