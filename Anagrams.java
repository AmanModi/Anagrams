/* IMPORTANT: Multiple classes and nested static classes are supported */

// uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());                // Reading input from STDIN
        int i,j,k;
        String[] firstString = new String[T];
        String[] secondString = new String[T];
        int deletion = 0;
        boolean match;
        
        for(i=0;i<T;i++)
        {
            firstString[i] = br.readLine();
            secondString[i] = br.readLine();
        }
        
        for(i=0;i<T;i++)
        {
            char[] first = firstString[i].toCharArray();
            char[] second = secondString[i].toCharArray();
            deletion = 0;
            for(j=0;j<first.length; j++)
            {
                match = false;
                for(k=0;k<second.length;k++)
                {
                    if(first[j] == second[k])
                    {
                        second[k] = '\0';
                        match = true;
                        break;
                    }
                }
                if(match ==false)
                {
                    deletion++;
                }
            }
            
            first = firstString[i].toCharArray();
            second = secondString[i].toCharArray();
            
            for(j=0;j<second.length; j++)
            {
                match = false;
                for(k=0;k<first.length;k++)
                {
                    if(second[j] == first[k])
                    {
                        first[k] = '\0';
                        match = true;
                        break;
                    }
                }
                if(match ==false)
                {
                    deletion++;
                }
            }
            System.out.println(deletion);
        }
        
        

    }
}
