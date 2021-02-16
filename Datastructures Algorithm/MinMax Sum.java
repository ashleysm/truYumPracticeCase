import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
long sum=0;
int size=arr.length;
Arrays.sort(arr);

for(int i=1;i<size-1;i++)
{
    sum+=arr[i];
}

System.out.println((sum+arr[0])+" "+(sum+arr[size-1]));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];
String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       
        for (int i = 0; i < 5; i++) {
             

           long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
           
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
