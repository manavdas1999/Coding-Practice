
/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

more20(20) → false
more20(21) → true
more20(22) → true
*/

public class Q10_more20 {
    public boolean more20(int n) {
        int res = n % 20;
        return res == 1 || res == 2;
    }
}
