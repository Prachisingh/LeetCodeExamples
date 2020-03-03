package com.prachi;
import java.util.HashSet;

class Sudoko {
    public boolean isValidSudoku(char[][] board) {


        for (int i = 0; i<9; i++) {
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> gridSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                //validate row
                if(board[i][j] != '.' && rowSet.contains(board[i][j])) {
                    return false;
                }
                else if(board[i][j] !='.'){
                    rowSet.add(board[i][j]);
                }

                // validate column
                if(board[j][i] != '.' && colSet.contains(board[j][i])) {
                    return false;
                }
                else if(board[j][i] !='.'){
                    colSet.add(board[j][i]);
                }

                //validate grid
                int ri = 3*(i/3);
                int ci = 3*(i%3);
                int row = ri + j/3;
                int col = ci + j%3;

                if(board[row][col] != '.' && gridSet.contains(board[row][col])) {
                    return false;
                }
                else if(board[row][col] !='.'){
                    gridSet.add(board[row][col]);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Sudoko solution = new Sudoko();
        boolean b = solution.isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        });
        System.out.println(b);
    }
}