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
}