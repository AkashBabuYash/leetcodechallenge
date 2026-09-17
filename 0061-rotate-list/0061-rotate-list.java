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
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int[] arr=new int[count];
        int idx=0;
        ListNode temp=head;
        while(temp!=null){
            arr[idx++]=temp.val;
            temp=temp.next;
        }
        k=k%count;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);




        ListNode dummy=new ListNode(0);
        ListNode temp1=dummy;
        for(int i=0;i<arr.length;i++){
            temp1.next=new ListNode(arr[i]);
            temp1=temp1.next;

        }
        return dummy.next;
        
    }
}