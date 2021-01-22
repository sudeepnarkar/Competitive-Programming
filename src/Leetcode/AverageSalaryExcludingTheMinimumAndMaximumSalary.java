package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 1/21/2021, Thu, 8:55 PM
 **/

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {


    /**
     * Given an array of unique integers salary where salary[i] is the salary of the employee i.
     * <p>
     * Return the average salary of employees excluding the minimum and maximum salary.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: salary = [4000,3000,1000,2000]
     * Output: 2500.00000
     * Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
     * Average salary excluding minimum and maximum salary is (2000+3000)/2= 2500
     * <p>
     * Example 2:
     * <p>
     * Input: salary = [1000,2000,3000]
     * Output: 2000.00000
     * Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
     * Average salary excluding minimum and maximum salary is (2000)/1= 2000
     * <p>
     * Example 3:
     * <p>
     * Input: salary = [6000,5000,4000,3000,2000,1000]
     * Output: 3500.00000
     * <p>
     * Example 4:
     * <p>
     * Input: salary = [8000,9000,2000,3000,6000,1000]
     * Output: 4750.00000
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 3 <= salary.length <= 100
     * 10^3 <= salary[i] <= 10^6
     * salary[i] is unique.
     * Answers within 10^-5 of the actual value will be accepted as correct.
     *
     * @param salary
     * @return
     */

    //Time Complexity = O(N), where N is the length of salary
    //Space Complexity = O(1)
    public double average(int[] salary) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            sum += salary[i];
        }
        return (double) (sum - max - min) / (salary.length - 2);
    }
}
