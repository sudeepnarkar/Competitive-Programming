package CodeForces;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import static java.lang.System.setOut;

/**
 * Created by sudeep on 12/4/17.
 */
public class Eevee {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
    static int n;
    static String line;
    static char[] lineArr = new char[10];

    static ArrayList<String> pokemons = new ArrayList<String>(Arrays.asList("vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"));

    static void solve() throws Exception {
        n = nextInt();
        line = next();

        line= line.trim().replaceAll("[^a-z]","");
        lineArr = line.toCharArray();

        //  System.out.println(line);


        label:
        {
            for (String pok : pokemons) {
                if (pok.contains(line) && pok.length() == n) {
                    System.out.println(pok);
                    break label;
                }
            }

            for (String pok : pokemons) {

                int count = 0;
                int pos;
                for (char ch : lineArr) {
                    pos = pok.indexOf(ch);
                    if (pok.indexOf(ch) >= 0)
                        count++;
                }
                if (count == lineArr.length) {
                    System.out.println(pok);
                    break label;
                }

            }
        }
    }
    static int nextInt() throws IOException {
        return parseInt(next());
    }

    static String next() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(),"");
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
