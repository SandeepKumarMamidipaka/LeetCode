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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode node1=head;
        ListNode node2=head.next;
       while(node2!=null){
        int gcdval=gcd(node1.val,node2.val);
        ListNode gcdnode=new ListNode(gcdval);
        node1.next=gcdnode;
        gcdnode.next=node2;
        node1=node2;
        node2=node2.next;
       } 
       return head;

    }
    public static int gcd(int a,int b){
        int min =Math.min(a,b);
        int max =Math.max(a,b);
        int temp=min;
        while(min!=0){
            
            if(max%min==0 && temp%min==0){
                return min;
            }
            else{
                min=min-1;
            }
        }
        return min;
    }
}