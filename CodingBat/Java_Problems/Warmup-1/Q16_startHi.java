
/*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
*/


public class Q16_startHi {
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
