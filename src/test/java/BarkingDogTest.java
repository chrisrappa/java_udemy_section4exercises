import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

  @Test
  void DogIsBarkingAtHourOne(){
    Boolean expected = true;
    assertEquals(expected, BarkingDog.shouldWakeUp(true, 1));
  }

  @Test
  void DogIsNotBarkingAtHourTwo(){
    Boolean expected = false;
    assertEquals(expected, BarkingDog.shouldWakeUp(false, 2));
  }

  @Test
  void DogIsBarkingAtHourEight(){
    Boolean expected = true;
    assertEquals(expected, BarkingDog.shouldWakeUp(true, 8));
  }

  @Test
  void DogIsBarkingAtHourNegativeOne(){
    Boolean expected = false;
    assertEquals(expected, BarkingDog.shouldWakeUp(true, -1));
  }


}