package org.example;
import java.util.logging.*;
public class TicTacToe {
    Logger l = Logger.getLogger("com.api.jar");

    public int horizontalcheck(char[][] board, int row) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'X') {
                count1++;
            } else if (board[row][i] == 'O') {
                count2++;
            }
        }
        if (count1 == board.length || count2 == board.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public int verticalcheck(char[][] board, int column) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'X') {
                count1++;
            } else if (board[i][column] == 'O') {
                count2++;
            }
        }
        if (count1 == board.length || count2 == board.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public int rightDiagonal(char[][] board) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count1++;
            } else if (board[i][i] == 'O') {
                count2++;
            }
        }
        if (count1 == board.length || count2 == board.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public int leftDiagnoal(char[][] board) {
        int count1 = 0;
        int count2 = 0;
        int j = board.length - 1;
        for (int i = 0; i < board.length; i++) {
            if (board[i][j] == 'X') {
                count1++;
            } else if (board[i][j] == 'O') {
                count2++;
            }
            j = j - 1;
        }
        if (count1 == board.length || count2 == board.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public int setplayer(char[][] board, int row, int column, int count) {
        if (board[row][column] == 'X' || board[row][column] == 'O') {
            l.info("invalid row and column");
            return 0;
        } else if (count % 2 == 0) {
            board[row][column] = 'X';
        } else if (count % 2 != 0) {
            board[row][column] = 'O';
        }
        return 1;
    }

    public int winGame(char[][] board, int row, int column) {
        int hor = horizontalcheck(board, row);
        int ver = verticalcheck(board, column);
        if (row == column) {
            if (hor == 1 || ver == 1 || rightDiagonal(board) == 1 || leftDiagnoal(board) == 1) {
                return 1;
            }
            return 0;
        } else {
            if (hor == 1 || ver == 1 || leftDiagnoal(board) == 1) {
                return 1;
            }
            return 0;
        }
    }

    public char[][] assignBoard(int dimension) {
        char[][] board = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                board[i][j] = '-';
            }
        }
        return board;

    }

    public void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                String z = board[i][j] + " ";
                l.info(z);
            }
            l.info("\n");
        }
    }
}