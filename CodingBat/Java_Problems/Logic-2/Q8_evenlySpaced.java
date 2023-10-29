
/*

Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public class Q8_evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {       
        boolean isAMid = a == (b+c)/2f;
        boolean isBMid = b == (a+c)/2f;
        boolean isCMid = c == (a+b)/2f;
        
        return isAMid || isBMid || isCMid;
      }
      
}
