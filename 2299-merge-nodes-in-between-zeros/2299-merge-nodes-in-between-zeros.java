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
        ListNode node1=head;
        ListNode node2=head.next;
        ListNode res=new ListNode();
        ListNode temp=res;
        while(node2!=null){
            int k=0;
            
            if(node1.val==0){
                while(node2.val!=0){
                    k+=node2.val;
                    node1=node2;
                    node2=node2.next;
                }
                temp.next=new ListNode(k);
                temp=temp.next;
            }
            else{
                node1=node2;
                node2=node2.next;
            }
        }
        return res.next;
    }
}