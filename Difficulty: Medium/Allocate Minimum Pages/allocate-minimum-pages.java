
class Solution {

    static boolean isValidAnswer(int arr[], int k, long mid) {

        int studentCount = 1;
        long pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > mid) {
                return false;
            }

            if (pages + arr[i] <= mid) {
                pages += arr[i];
            }
            else {
                studentCount++;

                if (studentCount > k) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    public int findPages(int[] arr, int k) {

        int n = arr.length;

        if (k > n) {
            return -1;
        }

        long s = 0;
        long e = 0;

        for (int i = 0; i < n; i++) {
            s = Math.max(s, arr[i]);
            e += arr[i];
        }

        long ans = -1;

        while (s <= e) {

            long mid = s + (e - s) / 2;

            if (isValidAnswer(arr, k, mid)) {

                ans = mid;
                e = mid - 1;

            }
            else {
                s = mid + 1;
            }
        }

        return (int) ans;
    }
}
