/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode solution = new ListNode(0);
    ListNode curr = solution;
    int carry;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null){
            ListNode newnode = new ListNode(0);
            int newval = l1.val + l2.val + carry;
            if(newval >= 10){
                newval -= 10;
                carry = 1;
            }
            else
                carry = 0;
            newnode.val = newval;
            curr.next = newnode;
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        if (l1 != null){
            while(l1 != null){
                ListNode newnode = new ListNode(0);
                int newval = l1.val + carry;
                if(newval >= 10){
                    newval -= 10;
                    carry = 1;
                }
                else
                    carry = 0;
                newnode.val = newval;
                curr.next = newnode;
                l1 = l1.next;
                curr = curr.next;
            }
        }
        if(l2 != null){
            while(l2 != null){
                ListNode newnode = new ListNode(0);
                int newval = l2.val + carry;
                if(newval >= 10){
                    newval -= 10;
                    carry = 1;
                }
                else
                    carry = 0;
                newnode.val = newval;
                curr.next = newnode;
                l2 = l2.next;
                curr = curr.next;
            }
        }
        if(l1 == null && l2 == null && carry==1){
            ListNode newnode = new ListNode(1);
            curr.next = newnode;
        }
        return solution.next;
    }
}
