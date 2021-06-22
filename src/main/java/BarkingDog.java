public class BarkingDog {

  public static Boolean shouldWakeUp(boolean isBarking, int hourOfDay){

    if(isBarking == true){
      if(hourOfDay >= 1 && hourOfDay <= 8){
        return(true);
      } else if (hourOfDay >= 22 && hourOfDay < 23){
        return (true);
      } else {
        return (false);
      }
    }

    return (false);
  }

}
