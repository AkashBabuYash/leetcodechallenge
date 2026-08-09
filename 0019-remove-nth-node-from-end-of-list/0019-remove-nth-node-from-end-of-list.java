class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode curr = head;

    
        while (curr != null) {
            count++;
            curr = curr.next;
        }

       
        if (n == count) {
            return head.next;
        }

        ListNode temp = head;
        int p = 1;

        
        while (temp != null) {

            if (p == count - n) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
            p++;
        }

        return head;
    }
}