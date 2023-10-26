
/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/

public class Q13_stringYak{
    public String stringYak(String str) {
        if(str.length() < 3) return str;
        String res = "";
        for(int i=0; i<str.length(); i++){
          if(i<str.length()-2 && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') i+=2;
          else res += "" + str.charAt(i);
        }
        return res;
    }
}