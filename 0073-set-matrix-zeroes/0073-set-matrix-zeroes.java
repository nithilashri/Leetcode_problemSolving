class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        
        for (int r : zeroRows) {
            for (int j = 0; j < cols; j++) {
                matrix[r][j] = 0;
            }
        }

        
        for (int c : zeroCols) {
            for (int i = 0; i < rows; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}
