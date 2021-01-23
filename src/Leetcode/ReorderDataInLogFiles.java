package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : Sudeep Narkar
 * @since : 1/23/2021, Sat, 11:30 AM
 **/

//https://leetcode.com/problems/reorder-data-in-log-files
public class ReorderDataInLogFiles {

    /**
     * You have an array of logs.  Each log is a space delimited string of words.
     * <p>
     * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
     * <p>
     * Each word after the identifier will consist only of lowercase letters, or;
     * Each word after the identifier will consist only of digits.
     * <p>
     * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.
     * <p>
     * Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.
     * <p>
     * Return the final order of the logs.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
     * Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= logs.length <= 100
     * 3 <= logs[i].length <= 100
     * logs[i] is guaranteed to have an identifier, and a word after the identifier.
     *
     * @param logs
     * @return the final order of the logs.
     */

    //Time Complexity = O(NLogN), where N is the number of Strings in logs Array
    //Space Complexity = O(1)
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, new Comparator<String>() {

            @Override
            public int compare(String log1, String log2) {

                int index1 = log1.indexOf(" ");

                String id1 = log1.substring(0, index1);
                String main1 = log1.substring(index1 + 1);

                String id2 = log2.substring(0, index1);
                String main2 = log2.substring(index1 + 1);

                boolean isDigit1 = Character.isDigit(main1.charAt(0));
                boolean isDigit2 = Character.isDigit(main2.charAt(0));

                if (!isDigit1 && !isDigit2) {
                    int value = main1.compareTo(main2);
                    if (value == 0) {
                        return id1.compareTo(id2);
                    }
                }

                if (isDigit1) {
                    if (isDigit2) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return -1;
                }
            }
        });

        return logs;
    }
}
