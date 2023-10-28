
/*

Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
*/

public class Q6_closeFar {
    public boolean closeFar(int a, int b, int c) {
        // b close, c far
        boolean isBC = Math.abs(a-b) <= 1 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2;
        // c close, b far
        boolean isCB = Math.abs(a-c) <= 1 && Math.abs(a-b) >= 2 && Math.abs(c-b) >= 2;
        
        return isBC || isCB;
    }
}
