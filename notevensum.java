import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static long solve(int n, int[] a) {
        long totalSum = 0;
        int smallestOdd = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int i = 0; i < n; i++) {
            totalSum += a[i];
            if (a[i] % 2 != 0) { 
                hasOdd = true;
                if (a[i] < smallestOdd) {
                    smallestOdd = a[i];
                }
            }
        }

        if (totalSum % 2 != 0) { 
            return totalSum;
        } else { 
            if (hasOdd) { 
                return totalSum - smallestOdd;
            } else { 
                return -1;
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); 
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            long result = solve(n, a);
            System.out.println(result);
        }
    }
}
