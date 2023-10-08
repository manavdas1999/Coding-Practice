
/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/

public class Q23_startOz {
    public String startOz(String str) {
        if(str.length() < 1) return "";
        String res = str.charAt(0) == 'o' ? "o" : "";
        if(str.length() > 1){
        res = res + (str.charAt(1) == 'z' ? "z" : "");
        }
        return res;
    } 
}
