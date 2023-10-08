
/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/

public class Q25_close10 {
    public int close10(int a, int b) {
        int rangeA = Math.abs(10 - a);
        int rangeB = Math.abs(10 - b);
        return rangeA == rangeB ? 0 : rangeA > rangeB ? b : a;
    }
}
