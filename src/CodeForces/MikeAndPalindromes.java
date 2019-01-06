package CodeForces;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;
import static java.lang.System.setOut;

public class MikeAndPalindromes {

        static BufferedReader in;
        static PrintWriter out;
        static StringTokenizer tok;
        static String str;
        static String newStr;
        static int count=0;
        static char ch;
        static List<Character> list = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        static void solve() throws Exception {
            str = next();
            if (str.length() >= 1 && str.length() <= 15) {

                if (str.length() == 1)
                    System.out.println("YES");
                else {
                    label:
                    {
                        for (int i = 0; i < str.length(); i++) {
                            if (Character.isUpperCase(str.charAt(i)))
                                break label;
                        }
                        for (int i = 0; i < str.length(); i++) {
                            for (char c : list) {
                                if (str.charAt(i) != c) {
                                    if (i != str.length() - 1)
                                        newStr = str.substring(0, i) + c + str.substring(i + 1);
                                    else
                                        newStr = str.substring(0, str.length()-1) + c;
                                    if (isPalindrome(newStr)) {
                                        System.out.println("YES");
                                        break label;
                                        // count++;
                                    }
                                }
                            }
                        }
                        /*if(count==1)
                            System.out.println("YES");
                        else*/
                        System.out.println("NO");
                    }
                }
            }
        }

        static int nextInt() throws IOException {
            return parseInt(next());
        }
        static Long nextLong() throws IOException {
            return parseLong(next());
        }

        static String next() throws IOException {
            while (tok == null || !tok.hasMoreTokens()) {
                tok = new StringTokenizer(in.readLine());
            }
            return tok.nextToken();
        }

    static boolean  isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
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
