package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 2/1/2021, Mon, 9:15 PM
 **/

//https://leetcode.com/problems/flood-fill
public class FloodFill {

    /**
     * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
     * <p>
     * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
     * <p>
     * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.
     * <p>
     * At the end, return the modified image.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * image = [[1,1,1],[1,1,0],[1,0,1]]
     * sr = 1, sc = 1, newColor = 2
     * Output: [[2,2,2],[2,2,0],[2,0,1]]
     * Explanation:
     * From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected
     * by a path of the same color as the starting pixel are colored with the new color.
     * Note the bottom corner is not colored 2, because it is not 4-directionally connected
     * to the starting pixel.
     * <p>
     * Note:
     * The length of image and image[0] will be in the range [1, 50].
     * The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.
     * The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
     *
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return
     */

    //Time Complexity = O(M*N), where M is the number of  rows and N is the number of columns
    //Space Complexity = O(M*N) (recursion stack), where M is the number of  rows and N is the number of columns
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int color = image[sr][sc];
        floodFillUtil(sr, sc, image, color, newColor);
        return image;
    }

    public void floodFillUtil(int r, int c, int[][] image, int color, int newColor) {

        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] == newColor || image[r][c] != color) {
            return;
        }

        image[r][c] = newColor;
        floodFillUtil(r - 1, c, image, color, newColor);
        floodFillUtil(r, c - 1, image, color, newColor);
        floodFillUtil(r + 1, c, image, color, newColor);
        floodFillUtil(r, c + 1, image, color, newColor);
        return;
    }
}
