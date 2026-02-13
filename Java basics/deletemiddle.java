class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head!=null && head.next==null){
            return null;
        }
         
        ListNode fast=head;
        ListNode slow=new ListNode(0);
        slow.next=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}