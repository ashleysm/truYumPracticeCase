import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static Stack<Integer> s1=new Stack<Integer>();
    public static Stack<Integer> s2=new Stack<Integer>();
    
    
    
    public static void Dequeue(){ 
    if(s2.isEmpty())
                {
                    while(!s1.isEmpty())
                    {
                        s2.push(s1.pop());
                    }                    
                }
                
                if (!s2.isEmpty()){                                
                    s2.pop(); 
                }
    }
    
    public static void printValue(){
        if(s2.isEmpty())
                {
                    while(!s1.isEmpty())
                    {
                        s2.push(s1.pop());
                    }   
                    System.out.println(s2.peek());                 
                }
                else{
                    System.out.println(s2.peek());  
                }
                
    }
    


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int type;
         Scanner sc = new Scanner(System.in);
        int queries= sc.nextInt();
        for(int i=0;i<queries;i++){
            type=sc.nextInt();
            if(type==1){
                s1.push( sc.nextInt() );
            }
            else if(type==2){
                Dequeue();
            }
            else if(type==3){
                printValue();
            }
        }
    }
}