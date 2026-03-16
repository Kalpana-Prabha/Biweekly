//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element. Can you solve it without sorting?
//
//Example 1:
//Input:
//nums = [3,2,1,5,6,4], k = 2
//Output: 5
//
//Example 2:
//Input:
//nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4


import java.util.*;

class Kthlargest {
    int solve(ArrayList<Integer> nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {

        Kthlargest obj = new Kthlargest();
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(3,2,1,5,6,4));
        int k1 = 2;
        int result1 = obj.solve(nums1, k1);
        System.out.println("example1:" + result1);

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(3,2,3,1,2,4,5,5,6));
        int k2 = 4;
        int result2 = obj.solve(nums2, k2);
        System.out.println("example2:" + result2);
    }
}