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
    public ListNode partition(ListNode head, int x) {
        ListNode firstpart=new ListNode(0);
        ListNode secondpart=new ListNode(0);
       ListNode first=firstpart;
        ListNode second=secondpart;
        while(head!=null){
            if(head.val<x){
                firstpart.next=head;
                firstpart=firstpart.next;
                head=head.next;
            }else{
                secondpart.next=head;
                secondpart=secondpart.next;
                head=head.next;
            }

        }
        secondpart.next=null;
        firstpart.next=second.next;

    
    return first.next;
        
    }
}