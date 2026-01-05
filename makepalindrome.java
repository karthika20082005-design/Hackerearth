import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());                // Reading input from STDIN
        while(t-->0)    // Writing output to STDOUT
        {
            int n = Integer.parseInt(br.readLine());
            String s=br.readLine();
            int freq[]=new int[26];
            for(int i=0;i<n;i++)
            {
                freq[s.charAt(i)-'a']++;
            }
            int odd=0;
            for(int i=0;i<26;i++)
            {
                if(freq[i]%2!=0)
                {
                    odd++;
                }
            }
            if(odd>1)
            {
                System.out.println(odd-1);
            }
            else
            {
               System.out.println(0); 
            }
        }
    }
}
