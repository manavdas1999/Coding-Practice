
/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
*/

public class Q23_conCat {
    public String conCat(String a, String b) {
        String aLastChar = a.length() > 0 ? a.substring(a.length()-1) : "";
        String bFirstChar = b.length() > 0 ? b.substring(0,1) : "";
        boolean isLastCharSame = aLastChar.equals(bFirstChar);
        return isLastCharSame ? a + b.substring(1) : a+b;
    }
}
