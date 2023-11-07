
/*

Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
*/

public class Q15_sameStarChar {
    public boolean sameStarChar(String str) {
        boolean flag = true;
        for(int i=1; i<str.length()-1; i++){
          if(str.charAt(i) == '*'){
            flag = str.charAt(i-1) == str.charAt(i+1);
          }
        }
        return flag;
      }      
}
