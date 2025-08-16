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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode node1=head;
        ListNode node2=head.next;
        while(node2!=null && node2!=null){
            int temp=node1.val;
            node1.val=node2.val;
            node2.val=temp;

            node1=node2.next;
            if(node1!=null){
                 node2=node1.next;
            }
           
            else{
                node2=null;
            }
        }
        return head;
    }
}