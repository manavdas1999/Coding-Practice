
/*

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public class Q9_mixString {
    public String mixString(String a, String b) {
        String smaller = a.length() < b.length() ? a : b;
        String bigger = a.length() > b.length() ? a : b;
        String res = "";
        int i;
        for(i=0; i<smaller.length();i++){
          res += "" + a.charAt(i) + b.charAt(i);
        }
        
        return res + bigger.substring(i);
      }
}
