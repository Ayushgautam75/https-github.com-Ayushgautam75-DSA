class Solution {
    public int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;

        // First window sum
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int maxSum = sum;

        // Sliding Window
        for (int i = k; i < n; i++) {

            sum = sum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}