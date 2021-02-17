import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String str = sc.nextLine();
            char ch[] = str.toCharArray();
            String s1="";
            String s2 ="";
            for(int i=0;i<str.length();i++)
            {
                if(i%2==0)
                {
                    s1 = s1 + ch[i];
                }
                if(i%2!=0)
                {
                    s2 = s2 + ch[i];
                }
            }
            System.out.println(s1 + " " + s2);
        }
        
    }
}
