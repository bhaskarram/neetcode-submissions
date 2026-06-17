class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char cell = board[i][j];
                if (cell == '.') continue;
                
                String rowKey = cell + " in row " + i;
                String colKey = cell + " in col " + j;
                String boxKey = cell + " in box " + (i/3) + "-" + (j/3);
                
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false; 
                }
            }
        }
        
        return true;
    }
}