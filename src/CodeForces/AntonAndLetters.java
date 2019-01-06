package CodeForces;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

/**
 * Created by sudeep on 11/4/17.
 */
public class AntonAndLetters {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
    static int uniqueCharCount = 0;
    static Map<Character, Integer> map = new HashMap<Character,Integer>();

    static void solve() throws Exception {

        String input = next();
        input=input.replaceAll("[^a-z]","");

        for (char c :input.toCharArray()) {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        System.out.println(map.size());

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
