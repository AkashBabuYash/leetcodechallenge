class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {

            ListNode curr = lists[i];

            while (curr != null) {
                arr.add(curr.val);
                curr = curr.next;
            }
        }

       int[] ar=new int[arr.size()];
       int idx=0;
       for(int key:arr){
        ar[idx++]=key;
       }
       Arrays.sort(ar);
       ListNode dummy=new ListNode(0);
       ListNode temp=dummy;
       for(int val:ar){
        temp.next=new ListNode(val);
        temp=temp.next;
       }

       return dummy.next;
    }
}