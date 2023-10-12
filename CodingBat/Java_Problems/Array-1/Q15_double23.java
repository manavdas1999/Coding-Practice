
/*

Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
*/

public class Q15_double23 {
    public boolean double23(int[] nums) {
        if(nums.length<2) return false;
        boolean isContain23Twice = (nums[0] + nums[1] == 4) || (nums[0] + nums[1] == 6);
        return isContain23Twice;
    }      
}
