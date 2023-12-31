package ca.pmulcahy.lc.q0xxx.q00xx.q002x.q0022;

import java.util.ArrayList;
import java.util.List;

// Given n pairs of parentheses, write a function to generate all combinations of well-formed
// parentheses.
public class GenerateParentheses {
  public static List<String> generateParenthesis(int n) {
    return generateParenthesis("", n, 0);
  }

  private static List<String> generateParenthesis(String prefix, int nAvailable, int nOpen) {
    if (nAvailable == 0 && nOpen == 0) {
      return List.of(prefix);
    }

    List<String> toReturn = new ArrayList<String>();
    if (nAvailable > 0) {
      toReturn.addAll(generateParenthesis(prefix + "(", nAvailable - 1, nOpen + 1));
    }
    if (nOpen > 0) {
      toReturn.addAll(generateParenthesis(prefix + ")", nAvailable, nOpen - 1));
    }
    return toReturn;
  }
}
