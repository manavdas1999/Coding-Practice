
/*

Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/

public class Q5_endOther {
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String smaller = a.length() > b.length() ? b:a;
        String larger = a.length() > b.length() ? a:b;
        // can do endsWith()
        return larger.substring(larger.length() - smaller.length()).equals(smaller);
    }
}
