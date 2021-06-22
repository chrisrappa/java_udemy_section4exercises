import java.io.PrintStream;

public class MegabytesConverter {


  public static String printMegabytesandKilobytes(int kilobytes){

      //convert MB to KB
      //1 MB = 1024KB

      if(kilobytes > 0){
        int kiloToMega = Math.round(kilobytes / 1024);
        int leftOverKilo = kilobytes % 1024;

        String conversionOutput = (kilobytes + " KB = " + kiloToMega + " MB and " + leftOverKilo + " KB");
        return (conversionOutput);
      } else {
        return("Invalid Value");
      }

    }
}
