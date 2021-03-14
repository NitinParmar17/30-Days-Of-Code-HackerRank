import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        Pattern p = Pattern.compile(".+@gmail\\.com");
        Matcher m;
        
        List<String> result = new ArrayList();
    
        for (int NItr = 0; NItr < N; NItr++) 
        {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            m = p.matcher(emailID);
            
            if(m.matches())
            {
                result.add(firstName);
            }
        }   
            Collections.sort(result);
            
            for(int i=0;i<result.size();i++)
            {
                System.out.println(result.get(i));
            }

        scanner.close();
    }
}
