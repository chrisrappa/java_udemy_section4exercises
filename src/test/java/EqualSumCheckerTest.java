import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

  @Test
  void SumCheckerOnePlusOneEqualsOneFalse() {
      Boolean expected = false;
      assertEquals(expected, EqualSumChecker.sumFirstSecondEqualsThird(1, 1, 1));
  }

  @Test
  void SumCheckerOnePlusOneEqualsTwoTrue() {
    Boolean expected = true;
    assertEquals(expected, EqualSumChecker.sumFirstSecondEqualsThird(1, 1, 2));
  }

  @Test
  void SumCheckerOneMinusOneEqualsZeroTrue() {
    Boolean expected = true;
    assertEquals(expected, EqualSumChecker.sumFirstSecondEqualsThird(1, -1, 0));
  }
}