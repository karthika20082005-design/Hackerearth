import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        
        String[] arr = br.readLine().trim().split(" ");
        
        HashMap<Long, Long> freq = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            long val = Long.parseLong(arr[i]);
            long key = val - (i + 1);   
            
            freq.put(key, freq.getOrDefault(key, 0L) + 1);
        }
        
        long result = 0;
        
        for (long count : freq.values()) {
            result += count * (count - 1);
        }
        
        System.out.println(result);
    }
}
