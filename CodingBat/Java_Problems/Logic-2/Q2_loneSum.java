
/*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.


loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
*/

public class Q2_loneSum {
    public int loneSum(int a, int b, int c) {
        int ab = a==b? -a-b : a+b;
        int bc = b==c? -b-c : b+c;
        int ac = a==c? -a-c : a+c;
        
        int total = (ab + bc + ac) / 2;
        return total >= 0 ? total : 0;
    }
}
