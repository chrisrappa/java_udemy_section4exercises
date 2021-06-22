import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

  @Test
  void areEqualByThreeDecimalPlaces() {

    Boolean expected = true;
    assertEquals(expected, DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
  }

  @Test
  void areEqualByThreeDecimalPlaces3() {

    Boolean expected = true;
    assertEquals(expected, DecimalComparator.areEqualByThreeDecimalPlaces(3.00, 3.00));
  }

  @Test
  void areNotEqualByThreeDecimalPlaces() {

    Boolean expected = false;
    assertEquals(expected, DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
  }

  @Test
  void areNotEqualByThreeDecimalPlacesNew() {

    Boolean expected = false;
    assertEquals(expected, DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
  }

}