package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/29/2021, Fri, 4:46 PM
 **/

//https://leetcode.com/problems/defanging-an-ip-address
public class DefangingAnIPAddress {

    /**
     * Given a valid (IPv4) IP address, return a defanged version of that IP address.
     * <p>
     * A defanged IP address replaces every period "." with "[.]".
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     * <p>
     * Example 2:
     * <p>
     * Input: address = "255.100.50.0"
     * Output: "255[.]100[.]50[.]0"
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The given address is a valid IPv4 address.
     *
     * @param address
     * @return
     */

    //Time Complexity = O(N), where N is the length of address
    //Space Complexity = O(N), where N is the length of address
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
