import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {


  @Test
  void toMilesPerHour() {

    long MPH = SpeedConverter.toMilesPerHour(1.5);
    assertEquals(1, MPH);

    MPH = SpeedConverter.toMilesPerHour(10.25);
    assertEquals(6, MPH);

    MPH = SpeedConverter.toMilesPerHour(-5.6);
    assertEquals(-1, MPH);

    MPH = SpeedConverter.toMilesPerHour(25.42);
    assertEquals(16, MPH);

    MPH = SpeedConverter.toMilesPerHour(75.114);
    assertEquals(47, MPH);

  }

  @Test
  void OnePointFiveKmPerHourToMphInStringForm() {
    String expected = "1.5 km/h = 1 mi/h";
    assertEquals(expected, SpeedConverter.printConversion(1.5));
  }

  @Test
  void TenPointTwentyFiveKmPerHourToMphInStringForm() {
    String expected = "10.25 km/h = 6 mi/h";
    assertEquals(expected, SpeedConverter.printConversion(10.25));
  }

  @Test
  void NegativeFivePointSixKmPerHourToMphInStringForm() {
    String expected = "Invalid Value";
    assertEquals(expected, SpeedConverter.printConversion(-5.6));
  }

  @Test
  void TwentyFivePointFourtyTwoKmPerHourToMphInStringForm() {
    String expected = "25.42 km/h = 16 mi/h";
    assertEquals(expected, SpeedConverter.printConversion(25.42));
  }

  @Test
  void SeventyFivePointOneOneFourKmPerHourToMphInStringForm() {
    String expected = "75.114 km/h = 47 mi/h";
    assertEquals(expected, SpeedConverter.printConversion(75.114));
  }
}