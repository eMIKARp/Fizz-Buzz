package pkg004.fizzbuzz;

/**
 * Pro/g/ramming Challenges v 3.0
 * Challenge 004: FizzBuzz
 * @author Emil.Karpowicz
 */
public class Main {

    public static void main(String[] args) 
    {
        for (int i = 0; i < 100; i++)
        {
            if ( (i % 3 == 0) & (i % 5 == 0)) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    
}
