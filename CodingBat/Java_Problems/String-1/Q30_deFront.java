
/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

public class Q30_deFront {
    public String deFront(String str) {    
  
        boolean isFirstCharA = str.length() > 0 ? str.substring(0,1).equals("a") : false;
        boolean isSecondCharB= str.length() > 1 ? str.substring(1,2).equals("b") : false;
        String endPart = str.length() > 2 ? str.substring(2) : ""; 
        return (isFirstCharA ? "a" : "") + (isSecondCharB ? "b" : "") + endPart;
    }
}
