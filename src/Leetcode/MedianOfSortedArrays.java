package Leetcode;

public class MedianOfSortedArrays {

/*
    There are two sorted arrays nums1 and nums2 of size m and n respectively.

    Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

    You may assume nums1 and nums2 cannot be both empty.

    Example 1:

    nums1 = [1, 3]
    nums2 = [2]

    The median is 2.0
    Example 2:

    nums1 = [1, 2]
    nums2 = [3, 4]

    The median is (2 + 3)/2 = 2.5*/

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        int medianLen = len / 2;
        double res = 0.0;
        int i = 0;
        int j = 0;
        int arr[] = new int[len];
        int index = 0;
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                arr[index++] = nums1[i++];
            } else {
                arr[index++] = nums2[j++];

            }
        }

        while (i < nums1.length) {
            arr[index++] = nums1[i++];
        }

        while (j < nums2.length) {
            arr[index++] = nums2[j++];
        }

        return (arr.length % 2 == 0) ? (arr[medianLen - 1] + arr[medianLen]) / 2.0 : (double) arr[medianLen];
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}
