package drinks.bars.bar;

public class Bar
{
    private final Set<String> customers;
    private final Map<String, Double> drinks;

    public Bar()
    {
        customers = new HashSet<>();
        drinks = new HashMap<>();
    }

    public void addCustomer(String customerName)
    {
        customers.add(customerName);
    }

    public boolean hasCustomer(String name)
    {
        return customers.contains(name);
    }

    public void orderDrink(String name, double price)
    {
        if (! drinks.containsKey(name))
            throw new Exception();

        if (drinks.get(name) != price)
            throw new Exception();
    }

    public boolean hasDrink(String drinkName)
    {
        return drinks.containsKey(drinkName);
    }

    public double getDrinkPrice(String drinkName)
    {
        return drinks.get(drinkName);
    }
}