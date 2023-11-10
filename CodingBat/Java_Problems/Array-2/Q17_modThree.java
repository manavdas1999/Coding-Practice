
/*

Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */

public class Q17_modThree {
    public boolean modThree(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
          if(isThreeEven(nums[i], nums[i+1], nums[i+2])) return true;
          if(isThreeOdd(nums[i], nums[i+1], nums[i+2])) return true;
        }
        return false;
      }
      
      // helper func
      boolean isThreeEven(int n1, int n2, int n3){
        return n1%2==0 && n2%2==0 && n3%2==0;
      }
      
      boolean isThreeOdd(int n1, int n2,int n3){
        return n1%2!=0 && n2%2!=0 && n3%2!=0;
      }
}
