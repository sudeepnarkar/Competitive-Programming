package CodeForces;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import static java.lang.System.setOut;

/**
 * Created by sudeep on 10/4/17.
 */
public class CrunchingNumbersJustForYou {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    static void solve() throws Exception {

        int n = nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(nextInt());
        }
        Collections.sort(list);
        for (int i = 0; i <10e8 ; i++) {
            // do nothing to spend at least a second on each test.
        }
        for (Integer val:list) {
            System.out.print(val+" ");
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
            solve();
            in.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }

}
