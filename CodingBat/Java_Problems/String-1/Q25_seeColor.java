
/*

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

public class Q25_seeColor{
    public String seeColor(String str) {
        if(str.length() >= 3){
        if(str.length() == 3) return str.substring(0,3).equals("red") ? "red" : "";
        return
        str.substring(0,3).equals("red") ? "red" : 
        str.substring(0,4).equals("blue") ? "blue" : "";
        }
        return "";
    }
}