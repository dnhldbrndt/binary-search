import java.io.*;
import java.util.*;

public class Main {

    static int binarySearch(int[] a, int x) {
        int minIndex = 0;
        int maxIndex = a.length-1;
        int midIndex = 0;
        //write your code here

            while (minIndex <= maxIndex) {
                midIndex = minIndex + (maxIndex - minIndex) / 2;
                //System.out.println("MID: " + midIndex + " MIN: " + minIndex + " MAX: " + maxIndex);
                if (a[midIndex] == x) {
                    return midIndex;
                } else if (a[midIndex] < x) {
                    minIndex = midIndex + 1;
                } else {
                    maxIndex = midIndex - 1;
                }
             
            }
            return -1;
    }

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            //System.out.print(linearSearch(a, b[i]) + " ");
            System.out.print(binarySearch(a, b[i]) + " ");
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
