class Solution {
    public boolean isValidSudoku(char[][] board) {    
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char cell = board[i][j];
                
                if (cell == '.') {
                    continue;
                }
                
                if (rows[i].contains(cell)) {
                    return false;
                }
                rows[i].add(cell);
                
                if (cols[j].contains(cell)) {
                    return false;
                }
                cols[j].add(cell);
                
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(cell)) {
                    return false;
                }
                boxes[boxIndex].add(cell);
            }
        }
        
        return true;
    }
}