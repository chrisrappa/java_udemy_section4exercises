import java.util.ArrayList;

public class TeenChecker {

  public static Boolean isOneNumberATeen(int first, int second, int third) {


    int numbers[] = {first, second, third};
    int i, x;

    for (i = 0; i < numbers.length; i++) {

      x = numbers[i];
      if (x >= 13 && x <= 19) {
        return (true);
      }
      return (false);
    }
    return(null);
  }
}

