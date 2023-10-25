
/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/

public class Q12_altPairs {
    public String altPairs(String str) {
        String res = "";
        for(int i=0; i<str.length(); i+=4){
          res += "" + str.charAt(i) + (((i+1) > str.length()-1) ? "" : str.charAt(i+1));
        }
        return res;
    }
}
