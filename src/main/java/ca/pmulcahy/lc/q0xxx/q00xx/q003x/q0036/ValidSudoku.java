package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0036;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
  public static boolean isValidSudoku(char[][] board) {
    return isValidSudokuRows(board) && isValidSudokuColumns(board) && isValidSudokuSubBoxes(board);
  }

  private static boolean isValidSudokuRows(char[][] board) {
    for (int i = 0; i < 9; i++) {
      final Set<Character> populatedNumbers = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        char c = board[i][j];
        if (c != '.' && !populatedNumbers.add(c)) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean isValidSudokuColumns(char[][] board) {
    for (int i = 0; i < 9; i++) {
      final Set<Character> populatedNumbers = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        char c = board[j][i];
        if (c != '.' && !populatedNumbers.add(c)) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean isValidSudokuSubBoxes(char[][] board) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        final Set<Character> populatedNumbers = new HashSet<>();
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            char c = board[i * 3 + k][j * 3 + l];
            if (c != '.' && !populatedNumbers.add(c)) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
}
