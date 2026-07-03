class Solution:
    def reverseSubArray(self, arr, l, r):

        def reverse(left, right):
            if left >= right:
                return

            arr[left], arr[right] = arr[right], arr[left]
            reverse(left + 1, right - 1)

        reverse(l - 1, r - 1)   # Convert 1-based to 0-based
        return arr