import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());                
        while(t-->0)
        {
            int count=0;
            String s = br.readLine(); 
            int freq[]=new int[26];
            for(int i=0;i<s.length();i++)
            {
                freq[s.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                count+=(freq[i]/2);
            }
            System.out.println(count);
        }
    }
}
