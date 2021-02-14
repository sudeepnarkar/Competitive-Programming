package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/14/2021, Sun, 6:40 PM
 **/

//https://leetcode.com/problems/utf-8-validation/
public class UTF8Validation {


    /**
     * A character in UTF8 can be from 1 to 4 bytes long, subjected to the following rules:
     * <p>
     * For 1-byte character, the first bit is a 0, followed by its unicode code.
     * For n-bytes character, the first n-bits are all one's, the n+1 bit is 0, followed by n-1 bytes with most significant 2 bits being 10.
     * <p>
     * This is how the UTF-8 encoding would work:
     * <p>
     * Char. number range  |        UTF-8 octet sequence
     * (hexadecimal)    |              (binary)
     * --------------------+---------------------------------------------
     * 0000 0000-0000 007F | 0xxxxxxx
     * 0000 0080-0000 07FF | 110xxxxx 10xxxxxx
     * 0000 0800-0000 FFFF | 1110xxxx 10xxxxxx 10xxxxxx
     * 0001 0000-0010 FFFF | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
     * <p>
     * Given an array of integers representing the data, return whether it is a valid utf-8 encoding.
     * <p>
     * Note:
     * The input is an array of integers. Only the least significant 8 bits of each integer is used to store the data. This means each integer represents only 1 byte of data.
     * <p>
     * Example 1:
     * <p>
     * data = [197, 130, 1], which represents the octet sequence: 11000101 10000010 00000001.
     * <p>
     * Return true.
     * It is a valid utf-8 encoding for a 2-bytes character followed by a 1-byte character.
     * <p>
     * Example 2:
     * <p>
     * data = [235, 140, 4], which represented the octet sequence: 11101011 10001100 00000100.
     * <p>
     * Return false.
     * The first 3 bits are all one's and the 4th bit is 0 means it is a 3-bytes character.
     * The next byte is a continuation byte which starts with 10 and that's correct.
     * But the second continuation byte does not start with 10, so it is invalid.
     *
     * @param data
     * @return true if UTF-8 validated or return false
     */

    //Time Complexity = O(N), where N is the length of data
    //Space Complexity = O(1)
    public boolean validUtf8(int[] data) {

        int numBytes = 0;
        for (int i = 0; i < data.length; i++) {
            int n = data[i];
            if (n > 255) {
                return false;
            }
            if ((n & 128) == 0) { // 0xxxxxxx, 1 byte, 128(10000000)
                numBytes = 1;
            } else if ((n & 224) == 192) {  // 110xxxxx, 2 bytes, 224(11100000), 192(11000000)
                numBytes = 2;
            } else if ((n & 240) == 224) {  // 1110xxxx, 3 bytes, 240(11110000), 224(11100000)
                numBytes = 3;
            } else if ((n & 248) == 240) { // 11110xxx, 4 bytes, 248(11111000), 240(11110000)
                numBytes = 4;
            } else {
                return false;
            }

            for (int j = 1; j < numBytes; j++) {
                if (j + i >= data.length) {
                    return false;
                } else if ((data[i + j] & 192) != 128) { // 192(11000000), 128(10000000)
                    return false;
                }
            }
            i = i + numBytes - 1; // go to the next byte if any
        }
        return true;
    }
}
