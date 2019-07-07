/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {  
        int carry=0;
        ListNode ln1=l1;
        ListNode ln2=l2;
        ListNode result=new ListNode(0);
        result.val=(ln1.val+ln2.val)%10;
        carry=(ln1.val+ln2.val)/10;
        
        ListNode temp=result;
        while(ln1.next!=null){
            ln1=ln1.next;
            int val1=ln1.val;
            int val2=0;
            if(ln2.next!=null){
                ln2=ln2.next;
                val2=ln2.val;
            }
            int cur=carry+val1+val2;
            carry=cur/10;
            temp.next=new ListNode(cur%10);
            temp=temp.next;
        }
        while(ln2.next!=null){
            ln2=ln2.next;
            int cur=ln2.val+carry;
            carry=cur/10;
            temp.next=new ListNode(cur%10);
            temp=temp.next;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
            temp=temp.next;
        }
        return result;
       }
}