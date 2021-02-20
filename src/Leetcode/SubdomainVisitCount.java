package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 2/20/21, Sat, 12:02 PM
 **/

//https://leetcode.com/problems/subdomain-visit-count
public class SubdomainVisitCount {

    /**
     * A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
     * <p>
     * Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
     * <p>
     * We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
     * <p>
     * Example 1:
     * Input:
     * ["9001 discuss.leetcode.com"]
     * Output:
     * ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
     * Explanation:
     * We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.
     * <p>
     * Example 2:
     * Input:
     * ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
     * Output:
     * ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
     * Explanation:
     * We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
     * <p>
     * Notes:
     * <p>
     * The length of cpdomains will not exceed 100.
     * The length of each domain name will not exceed 100.
     * Each address will have either 1 or 2 "." characters.
     * The input count in any count-paired domain will not exceed 10000.
     * The answer output can be returned in any order.
     *
     * @param cpdomains
     * @return the counts of the number of visits to each subdomain.
     */


    //Time Complexity = O(N*M), where N is the length of cpdomain and M is the average length of each domain
    //Space Complexity = O(N*M),  where N is the length of cpdomain and M is the average length of each domain
    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> resList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String str : cpdomains) {
            String[] arr = str.split(" ");
            int count = Integer.parseInt(arr[0]);
            String domains = arr[1];
            map.put(domains, map.getOrDefault(domains, 0) + count);
            for (int i = 0; i < domains.length(); i++) {
                if (domains.charAt(i) == '.') {
                    String domain = domains.substring(i + 1);
                    map.put(domain, map.getOrDefault(domain, 0) + count);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String domain = entry.getKey();
            String count = String.valueOf(entry.getValue());
            resList.add(count + " " + domain);
        }
        return resList;
    }
}
