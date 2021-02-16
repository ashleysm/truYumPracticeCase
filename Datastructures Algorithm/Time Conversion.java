import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] time= s.split(":");  
        String str=time[2].substring(2,4);
        int hr=Integer.parseInt(time[0]);
        int min=Integer.parseInt(time[1]);
        int sec=Integer.parseInt(time[2].substring(0,2));
        if(str.equals("AM") && hr==12)
            hr=0;
        if(str.equals("PM") && hr<12)
            hr+=12;
         String output=String.format("%02d",hr)+":"+String.format("%02d",min)+":"+String.format("%02d",sec); 
      
      return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}