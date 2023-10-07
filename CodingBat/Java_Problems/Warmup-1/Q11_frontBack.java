/*

Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

*/

public class Q11_frontBack {
    public String frontBack(String str) {
        int lastIndex = str.length() - 1;
        return str.length() < 2 ? 
        str : str.charAt(lastIndex) + str.substring(1, lastIndex) + str.charAt(0);
    }
}
