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
        int c=0;
        ListNode n=head;
        while(n!=null){
            c++;
            n=n.next;
        }
        c=c-1;
        // System.out.println(c);
        int res=0;
        while(head!=null){
            int p=(int)(Math.pow(2,c))*head.val;
            res+=p;
            head=head.next;
            c--;
        }
        return res;
        
    }
}