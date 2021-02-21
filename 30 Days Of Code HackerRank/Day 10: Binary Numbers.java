import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        int temp;
        String str = "";
        while(n!=0)
        {
            temp = n%2;
            str = str + temp;
            n=n/2;
        }
        char[] arr = new char[str.length()];
        
        for(int i=str.length()-1;i>=0;i--)
        {
            arr[i] = str.charAt(str.length()-i-1);
        }
        
        int max = -990;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
            {
                count=0;
            }
            if(arr[i]=='1')
            {
                count++;
                 max = Math.max(max,count); 
            }
           
        }
        System.out.println(max);

    }
}
