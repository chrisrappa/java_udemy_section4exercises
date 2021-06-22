import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MegabytesConverterTest {

  @Test
  void TwentyFiveHundredKilobytesToMegabytesPlusRemainder() {
    String expected = "2500 KB = 2 MB and 452 KB";
    assertEquals(expected, MegabytesConverter.printMegabytesandKilobytes(2500));

  }

  @Test
  void NegativeTenTwentyFourKilobytesToMegabytesPlusRemainder() {
    String expected = "2500 KB = 2 MB and 452 KB";
    assertEquals(expected, MegabytesConverter.printMegabytesandKilobytes(2500));

  }

  @Test
  void FiveThousandKilobytesToMegabytesPlusRemainder() {
    String expected = "2500 KB = 2 MB and 452 KB";
    assertEquals(expected, MegabytesConverter.printMegabytesandKilobytes(2500));

  }
}