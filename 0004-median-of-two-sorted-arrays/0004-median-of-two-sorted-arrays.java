class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        int idx = 0;

        for (int i = 0; i < nums1.length; i++) {
            arr[idx++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            arr[idx++] = nums2[i];
        }

        Arrays.sort(arr);

        int n = arr.length;
        int mid = n / 2;

        if (n % 2 != 0) {
            return arr[mid];
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
    }
}