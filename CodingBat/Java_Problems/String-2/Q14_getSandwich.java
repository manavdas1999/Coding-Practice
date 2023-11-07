
/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/

public class Q14_getSandwich {
    public String getSandwich(String str) {
  
        int start = str.indexOf("bread");
        int end = str.lastIndexOf("bread");
        
        if(start == -1 || start==end) return "";
        return str.substring(start+5, end);
    }
}
