// Given an array arr[] of size n consisting of non-negative integers, where each element represents the height of a bar in an elevation map and the width of each bar is 1, determine the total amount of water that can be trapped between the bars after it rains.

class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int water = 0;

        for (int i = 1; i < n - 1; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];

            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }

            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }

            water += Math.min(leftMax, rightMax) - arr[i];
        }

        return water;
    }
}
