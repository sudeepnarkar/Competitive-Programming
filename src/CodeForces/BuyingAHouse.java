package CodeForces;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

/**
 * Created by sudeep on 10/4/17.
 */
public class BuyingAHouse {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    static void solve() throws Exception {
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();

        int min = 100;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listCanBuy = new ArrayList<Integer>();

        if (n >= 2 && n <= 100 && k >= 1 && k <= 100 && m >= 1 && n >= m) {
            m = m-1;
            for (int i = 0; i < n; i++) {
                int num = nextInt();
                list.add(num);
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= k && list.get(i) != 0)
                    listCanBuy.add(i);
            }
            if(listCanBuy.contains(m))
                listCanBuy.remove(m);

            for (int i = 0; i <listCanBuy.size() ; i++) {
                if(Math.abs(listCanBuy.get(i)-m)<min)
                    min = Math.abs(listCanBuy.get(i)-m);
            }


            System.out.println(min*10);
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
