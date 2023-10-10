
/*

Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/

public class Q17_fizzString{
    public String fizzString(String str) {
        boolean startsWithF = str.charAt(0) == 'f';
        boolean endsWithB = str.charAt(str.length()-1) == 'b';
        if(startsWithF && endsWithB) return "FizzBuzz";
        if(startsWithF) return "Fizz";
        if(endsWithB) return "Buzz";
        return str;
    }
}