public class Apple implements GroceryProductFactory
{
    private double price;
    
    @Override
    public void setPrice()
    {
        this.price = ReadDB.getDBPrice("Apple");
    }

    public double getPrice()
    {
        return this.price;
    }
}
