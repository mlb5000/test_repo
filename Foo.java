package test;


public class Foo
{

    /**
     * Given two numbers, a and b, this method returns their product.
     * E.g, if given 2 and 3, it will return 2 x 3 = 6.
     */
    public long multiply(long a, long b)
    {
        return a * b;
    }

    /**
     * Given a number, this method multiplies it to itself
     * and returns it.
     *
     * E.g, given 2, it will return 2 x 2 = 4
     */
    public long square(long number)
    {
        return number * number;
    }

    /**
     * Given a number, this method multiplies that number to itself 3 times, and
     * returns it.
     *
     * E.g, given 2, it will return 2 x 2 x 2 = 8
     */
    public long cube(long number)
    {
        return number * number * number;
    }

    /**
     * Given a String, this method returns a reverse of that String.
     * E.g given 'cat', it will return 'tac'.
     */
    public String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
}