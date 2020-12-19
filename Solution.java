
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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null) {
            return head;
    }
        int size = 1; // to get the length of the list
        ListNode tail = head; // fetching the tail of the list 
        // traverse to the tail and count the number of the elements in the list
        while(tail.next != null){
            size++;
            tail = tail.next;
        }
        // normalize the value that is to be rotated
        k %= size;
        if(k==0)
            return head;
        // make the cycle of the given list
        tail.next = head;
        // find the new tail 
        int newtailnumber = size - k;
        ListNode newtail = tail;
        // traverse to the new tail and then make the new head by newhead= newtail.next and newtail = null
        while(newtailnumber > 0){
            newtail = newtail.next;
            newtailnumber --;
            
        }
        ListNode newhead =newtail.next;
        newtail.next = null;
        return newhead;
        
    }
}
