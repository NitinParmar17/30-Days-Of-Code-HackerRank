import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int flag = 1;
            
            if(n==0 || n==1)
            {
                System.out.println("Not prime");
            }
            else if(n==2)
            {
                System.out.println("Prime");
            }
            else
            {
                for(int i=2;i<=n/2;i++)
                {
                    if(n%i==0)
                    {
                        flag = 1;
                        // System.out.println("Not Prime");
                        break;
                    }
                    else
                    {
                        flag = 0;
                    }
                }
                if(flag==0)
                {
                    System.out.println("Prime");
                }
                else
                {
                     System.out.println("Not prime");
                }
            }
        }
    }
}
