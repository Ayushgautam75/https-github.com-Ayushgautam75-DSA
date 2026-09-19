import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Frequency count
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int n = arr.length;

        int repeating = -1;
        int missing = -1;

        // Find repeating and missing
        for (int i = 1; i <= n; i++) {

            if (freq.getOrDefault(i, 0) == 2) {
                repeating = i;
            }

            if (freq.getOrDefault(i, 0) == 0) {
                missing = i;
            }
        }

        // GFG order: [repeating, missing]
        ans.add(repeating);
        ans.add(missing);

        return ans;
    }
}