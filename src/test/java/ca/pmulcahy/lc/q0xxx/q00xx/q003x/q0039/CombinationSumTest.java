package ca.pmulcahy.lc.q0xxx.q00xx.q003x.q0039;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumTest {

  @Test
  public void example1Test() {
    int[] inputCandidates = {2, 3, 6, 7};
    int inputTarget = 7;
    List<List<Integer>> expected = List.of(List.of(2, 2, 3), List.of(7));
    List<List<Integer>> actual = CombinationSum.combinationSum(inputCandidates, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example2Test() {
    int[] inputCandidates = {2, 3, 5};
    int inputTarget = 8;
    List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
    List<List<Integer>> actual = CombinationSum.combinationSum(inputCandidates, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void example3Test() {
    int[] inputCandidates = {2};
    int inputTarget = 1;
    List<List<Integer>> expected = List.of();
    List<List<Integer>> actual = CombinationSum.combinationSum(inputCandidates, inputTarget);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void lc1Test() {
    int[] inputCandidates = {3, 5, 8};
    int inputTarget = 11;
    List<List<Integer>> expected = List.of(List.of(3, 3, 5), List.of(3, 8));
    List<List<Integer>> actual = CombinationSum.combinationSum(inputCandidates, inputTarget);
    Assertions.assertEquals(expected, actual);
  }
}
