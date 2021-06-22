import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LeapYearCalculatorTest {

  @Test
  void YearNegative1600IsNotLeapYear(){
    Boolean expected = false;
    assertEquals(expected, LeapYearCalculator.LeapYear(-1600));
  }

  @Test
  void Year1600IsALeapYearReturnsTrue(){
    Boolean expected = true;
    assertEquals(expected, LeapYearCalculator.LeapYear(1600));
  }

  @Test
  void Year2017IsNotALeapYearReturnsFalse(){
    Boolean expected = false;
    assertEquals(expected, LeapYearCalculator.LeapYear(2017));
  }

  @Test
  void Year2000IsALeapYearReturnsTrue(){
    Boolean expected = true;
    assertEquals(expected, LeapYearCalculator.LeapYear(2000));
  }

}