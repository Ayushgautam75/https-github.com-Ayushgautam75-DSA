class Solution {
    public static int[] colSum(int mat[][]) {

        int m = mat.length;        // number of rows
        int n = mat[0].length;     // number of columns

        int[] ans = new int[n];

        for (int col = 0; col < n; col++) {

            int sum = 0;

            for (int row = 0; row < m; row++) {

                sum = sum + mat[row][col];
            }

            ans[col] = sum;
        }

        return ans;
    }
}