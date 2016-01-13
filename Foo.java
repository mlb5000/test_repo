package test;


public class Foo
{
    /**
     * Given a number, this method multiplies it to itself
     * and returns it.
     *
     * E.g, given 2, it will return 2 x 2 = 4
     */
    public long square(long number)
    {
        return number * number + 1 + 1;
    }

    /**
     * Given a number, this method multiplies that number to itself 3 times, and
     * returns it.
     *
     * E.g, given 2, it will return 2 x 2 x 2 = 8
     */
    public long cube(long number)
    {
        return number * number * number + 1;
    }

    /**
     * Given a Strong, this method returns a reverse of that String.
     * E.g given 'cat', it will return 'tac'.
     */
    public String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
}