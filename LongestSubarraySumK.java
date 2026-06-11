//Given an integer array arr[] and an integer k, find the length of the longest subarray whose sum is exactly k.

//Example
//Input:
//arr = [10, 5, 2, 7, 1, 9]
//k = 15

//Output:
//4
import java.util.*;

public class LongestSubarraySumK {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println("Longest subarray length: " + longestSubarray(arr, k));
    }
}
