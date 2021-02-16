import java.util.*;

public class reverseArray { 
  
    /* function that reverses array and stores it  
       in another array*/
    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        
        for (int k = 0; k < n; k++) { 
            System.out.print(b[k]+" "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int [] arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr, arr.length); 
    } 
} 