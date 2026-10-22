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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
     
        HashSet<Integer> s=new HashSet<>();
        while(curr!=null){
             s.add(curr.val);
            curr=curr.next;
           
        }
         int[] arr=new int[s.size()];
         int i=0;
        for(int val:s){
            arr[i++]=val;
        }
        Arrays.sort(arr);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int val:arr){
            temp.next=new ListNode(val);
            temp=temp.next;

        }
        return dummy.next;
       
   

        
    }
}