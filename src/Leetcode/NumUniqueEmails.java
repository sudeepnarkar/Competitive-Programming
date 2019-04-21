package Leetcode;

import java.util.HashSet;

public class NumUniqueEmails {

    public static int numUniqueEmails(String[] emails) {

        String localName;
        String domainName;
        HashSet<String> set = new HashSet<String>();
        for (String email : emails) {
            String[] strArr = email.split("@");
            localName = strArr[0];
            domainName = strArr[1];
            localName = localName.split("\\+")[0];
            localName = localName.replaceAll("\\.", "");
            String finalEmail = localName + "@" + domainName;
            set.add(finalEmail);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String [] arr = new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(arr));
    }
}
