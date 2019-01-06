package CodeForces;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import static java.lang.System.setOut;

/**
 * Created by sudeep on 9/4/17.
 */
public class TheNumberOfPositions {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    static void solve() throws Exception {
        int n = nextInt();
        int a = nextInt();
        int b = nextInt();

        if(a<n && b<n){
           int num = (n-Math.max(a+1,n-b))+1;
            System.out.println(num);
        }
    }

    static int nextInt() throws IOException {
        return parseInt(next());
    }

    static String next() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(new OutputStreamWriter(System.out));
            solve();
            in.close();
            out.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }

}
