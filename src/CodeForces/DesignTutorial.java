package CodeForces;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

    public class DesignTutorial {

        static BufferedReader in;
        static PrintWriter out;
        static StringTokenizer tok;

        static void solve() throws Exception {

            int num = nextInt();
            int a=0;
            int b=0;
            int count=0;
            for (int i = 2; i <num ; i++) {
                if(!isPrime(i)){
                    if(!isPrime(num-i)){
                        System.out.println(i+" "+(num-i));
                        break;
                    }
                }
            }
        }

        static boolean isPrime(int n){
            // fast even test.
            if(n > 2 && (n & 1) == 0)
                return false;
            // only odd factors need to be tested up to n^0.5
            for(int i = 3; i * i <= n; i += 2)
                if (n % i == 0)
                    return false;
            return true;
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
