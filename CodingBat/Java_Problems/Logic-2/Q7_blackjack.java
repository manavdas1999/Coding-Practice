
/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/

public class Q7_blackjack {
    public int blackjack(int a, int b) {
        int aValue = 21 - a;
        int bValue = 21 - b;
        
        if (aValue < 0 && bValue < 0) return 0;
        else{
          if (aValue < 0) return b;
          else if (bValue < 0) return a;
          return aValue < bValue ? a : b;
        }
    }
}
