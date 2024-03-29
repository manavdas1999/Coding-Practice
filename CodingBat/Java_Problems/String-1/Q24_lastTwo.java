
/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/

public class Q24_lastTwo {
    public String lastTwo(String str) {
        if(str.length() >= 2){
          String lastTwoReversed = str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
          return str.length() == 2 ? lastTwoReversed : str.substring(0, str.length()-2) + lastTwoReversed;     
        }
        return str;
    }
}
