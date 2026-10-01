class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[col][row];

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                res[i][j] = matrix[i][j];
            }
        }

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                matrix[j][(col-1)-i] = res[i][j];
            }
        }
    }
}
