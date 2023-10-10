
/*

Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
*/

public class Q29_shareDigit {
    public boolean shareDigit(int a, int b) {
        int aleft = a/10;
        int aright = a%10;
        int bleft = b/10;
        int bright = b%10;
        
       return aleft == bleft || aleft == bright || aright == bleft || aright == bright;
    }
}
