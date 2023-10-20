
/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/

public class Q33_withoutX2 {
    public String withoutX2(String str) {
        if(str.length() < 2) return "";
        String firstChar = str.substring(0,1).equals("x") ? "" : str.substring(0,1);
        String secondChar = str.substring(1,2).equals("x") ? "" : str.substring(1,2);
        return firstChar + secondChar + str.substring(2);
    }
}
