import java.util.*;

class Solution {
    public int firstRepeated(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Frequency count
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find first repeating element
        for (int i = 0; i < arr.length; i++) {

            if (freq.get(arr[i]) > 1) {
                return i + 1;
            }
        }

        return -1;
    }
}