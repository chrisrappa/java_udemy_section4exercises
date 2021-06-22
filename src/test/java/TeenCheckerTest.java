import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenCheckerTest {

  @Test
  void isThereANumberInArgumentsThatIsInTheTeensTrue() {
      Boolean expected = true;
      assertEquals(expected, TeenChecker.isOneNumberATeen(9, 99, 19) );
  }

  @Test
  void isThereANumberInArgumentsThatIsInTheTeensTrueSecondTest() {
    Boolean expected = true;
    assertEquals(expected, TeenChecker.isOneNumberATeen(23, 15, 42) );
  }

  @Test
  void isThereANumberInArgumentsThatIsInTheTeensFalse() {
    Boolean expected = false;
    assertEquals(expected, TeenChecker.isOneNumberATeen(22, 23, 34) );
  }
}