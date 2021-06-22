public class EqualSumChecker {

  public static Boolean sumFirstSecondEqualsThird(int first, int second, int third) {
    int sum = first + second;

    if(sum == third){
      return(true);
    } else {
      return(false);
    }
  }
}
