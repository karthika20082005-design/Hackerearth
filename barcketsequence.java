import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();   
        int currentsum=0,minsum=Integer.MAX_VALUE,countmin=0;  
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                currentsum++;
            }
            else
            {
                currentsum--;
            }
            if(currentsum<minsum)
            {
                minsum=currentsum;
                countmin=1;
            }
            else if(currentsum==minsum)
            {
                countmin++;
            }
        }    
        if(currentsum!=0)
        {
            System.out.println(0);
        }    
        else
        {
            System.out.println(countmin);
        }
    }
}
