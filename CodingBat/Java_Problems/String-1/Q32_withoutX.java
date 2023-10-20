
/*

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/

public class Q32_withoutX {
    public String withoutX(String str) {
        if(str.length() < 2) return "";
        String firstChar = str.substring(0,1).equals("x") ? "" : str.substring(0,1);
        String lastChar = str.substring(str.length()-1).equals("x") ? "" : str.substring(str.length()-1);
        return firstChar + str.substring(1,str.length()-1) + lastChar;
    }
}
