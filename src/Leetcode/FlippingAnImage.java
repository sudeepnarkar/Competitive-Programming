package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/4/21, Thu, 4:39 PM
 **/

//https://leetcode.com/problems/flipping-an-image
public class FlippingAnImage {

    /**
     * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
     * <p>
     * To flip an image horizontally means that each row of the image is reversed.
     * <p>
     * For example, flipping [1,1,0] horizontally results in [0,1,1].
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     * <p>
     * For example, inverting [0,1,1] results in [1,0,0].
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
     * Output: [[1,0,0],[0,1,0],[1,1,1]]
     * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
     * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     * Example 2:
     * <p>
     * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
     * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     *
     * @param image
     * @return return the image after flipping the image horizontally, then inverting it
     */

    //Time Complexity = O(N*N), where N is the length rowLen and colLen of the image
    //Space Complexity = O(1)
    public int[][] flipAndInvertImage(int[][] image) {

        int rowLen = image.length;
        int colLen = image[0].length;

        for (int r = 0; r < rowLen; r++) {
            int i = 0;
            int j = colLen - 1;
            while (i < j) {
                int temp = image[r][i];
                image[r][i] = image[r][j];
                image[r][j] = temp;
                i++;
                j--;
            }
            for (int c = 0; c < colLen; c++) {
                image[r][c] = image[r][c] == 1 ? 0 : 1;
            }
        }
        return image;
    }
}
