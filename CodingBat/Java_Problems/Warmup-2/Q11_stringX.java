
/*

Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

public class Q11_stringX {
    public String stringX(String str) {
        if(str.length() < 3) return str;
        String res = "";
        String middle = str.substring(1,str.length()-1);
        for(int i=0; i<middle.length(); i++){
          res += middle.charAt(i) == 'x' ? "" : middle.charAt(i);
        }
        return str.charAt(0) + res + str.charAt(str.length()-1);
    }      
}
