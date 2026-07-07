class Solution:
    def bubbleSort(self, arr):
        n = len(arr)

        for i in range(n - 2, -1, -1):
            is_swap = False

            for j in range(0, i + 1):
                if arr[j] > arr[j + 1]:
                    arr[j], arr[j + 1] = arr[j + 1], arr[j]
                    is_swap = True

            if not is_swap:
                break

        return arr