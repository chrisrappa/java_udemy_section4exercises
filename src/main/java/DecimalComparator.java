public class DecimalComparator {

  public static Boolean areEqualByThreeDecimalPlaces(double v, double v1) {

    v = v * 1000;
    v1 = v1 * 1000;

    int newV = (int) (v);
    int newV1 = (int) (v1);

    if(newV == newV1){
      return (true);
    } else {
      return (false);
    }

  }
}
