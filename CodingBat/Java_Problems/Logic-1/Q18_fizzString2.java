
/*

Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)


fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"

*/

public class Q18_fizzString2 {
    public String fizzString2(int n) {
        boolean isDivBy3 = n % 3 == 0;
        boolean isDivBy5 = n % 5 == 0;
        if(isDivBy3 && isDivBy5) return "FizzBuzz!";
        if(isDivBy3) return "Fizz!";
        if(isDivBy5) return "Buzz!";
        return n + "!";
    }
}
