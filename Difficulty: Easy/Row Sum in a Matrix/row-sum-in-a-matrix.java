class Solution {
    public static int[] rowSum(int mat[][]) {

        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m];

        for (int row = 0; row < m; row++) {

            int sum = 0;

            for (int col = 0; col < n; col++) {

                sum = sum + mat[row][col];
            }

            result[row] = sum;
        }

        return result;
    }
}