class Solution {

    int countFreq(int[] arr, int target) {

        int lower = getLowerBound(arr, target);
        int upper = getUpperBound(arr, target);

        return upper - lower;
    }

    int getLowerBound(int[] arr, int target) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;

        int ans = n;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {

                // store ans
                ans = mid;

                // move to left
                e = mid - 1;
            }
            else {

                // move to right
                s = mid + 1;
            }
        }

        return ans;
    }

    int getUpperBound(int arr[], int target) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;

        int ans = n;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] <= target) {

                // move to right
                s = mid + 1;
            }
            else {

                // store ans
                ans = mid;

                // move to left
                e = mid - 1;
            }
        }

        return ans;
    }
}