package CodeForces;
import java.util.ArrayList;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import static java.lang.System.setOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class Pangram {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    static void solve() throws Exception {

        int num = nextInt();
        ArrayList<Character> list = new ArrayList<Character>();
        char [] charArr;
         if(num>=26) {
            charArr = next().toCharArray();
             for (char ch:charArr) {
                if((int)ch>=65 && (int)ch<=90||((int)ch>=97 && (int)ch<=122)){
                    ch = Character.toLowerCase(ch);
                    if(!list.contains(ch))
                        list.add(ch);
                }
             }

             if(list.size()==26)
                 System.out.println("YES");
             else
                 System.out.println("NO");

        }
        else
            System.out.println("NO");

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
