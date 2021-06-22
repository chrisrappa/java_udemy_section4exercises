public class SpeedConverter {


  public static long toMilesPerHour(double kilometersPerHour){
    if(kilometersPerHour > 0){
      double milesPerHour = kilometersPerHour * 0.6215;
      long milesPerHourRounded = Math.round(milesPerHour);
      return(milesPerHourRounded);
    }

    return(-1);
  }

  public static String printConversion(double kilometersPerHour){
    if(kilometersPerHour > 0){
      double milesPerHour = kilometersPerHour * 0.6215;
      long milesPerHourRounded = Math.round(milesPerHour);
      return(kilometersPerHour + " km/h = " + milesPerHourRounded + " mi/h");
    } else {
      return("Invalid Value");
    }

  }
}
