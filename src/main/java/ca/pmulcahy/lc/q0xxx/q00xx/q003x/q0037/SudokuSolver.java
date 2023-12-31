package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0037;

import java.util.HashSet;
import java.util.Set;

public class SudokuSolver {
  public static void solveSudoku(char[][] board) {
    isSolvedSudoku(board, 0);
  }

  private static boolean isSolvedSudoku(char[][] board, int pos) {
    int nextEmptyPosition = getNextEmptyPosition(board, pos);
    if (nextEmptyPosition == -1) {
      return true; // assuming provided board is valid
    }

    int row = posToRow(nextEmptyPosition);
    int col = posToCol(nextEmptyPosition);
    for (int i = 1; i <= 9; i++) {
      board[row][col] = Character.forDigit(i, 10);
      if (isValidRow(board, row)
          && isValidColumn(board, col)
          && isValidSubBox(board, row, col)
          && isSolvedSudoku(board, nextEmptyPosition + 1)) {
        return true;
      }
    }
    board[row][col] = '.'; // No valid solution
    return false;
  }

  private static int getNextEmptyPosition(char[][] board, int pos) {
    if (pos > 80) {
      return -1;
    }
    int row = posToRow(pos);
    int col = posToCol(pos);

    for (int i = col; i < 9; i++) {
      if (board[row][i] == '.') {
        return row * 9 + i;
      }
    }

    for (int i = row + 1; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          return i * 9 + j;
        }
      }
    }
    return -1;
  }

  private static int posToRow(int pos) {
    return pos / 9;
  }

  private static int posToCol(int pos) {
    return pos % 9;
  }

  private static boolean isValidRow(char[][] board, int row) {
    Set<Character> usedNums = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      char c = board[row][i];
      if (c != '.' && !usedNums.add(c)) {
        return false;
      }
    }
    return true;
  }

  private static boolean isValidColumn(char[][] board, int column) {
    Set<Character> usedNums = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      char c = board[i][column];
      if (c != '.' && !usedNums.add(c)) {
        return false;
      }
    }
    return true;
  }

  private static boolean isValidSubBox(char[][] board, int row, int column) {
    int subBoxRow = row / 3;
    int subBoxColumn = column / 3;
    Set<Character> usedNums = new HashSet<>();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        char c = board[subBoxRow * 3 + i][subBoxColumn * 3 + j];
        if (c != '.' && !usedNums.add(c)) {
          return false;
        }
      }
    }
    return true;
  }
}
