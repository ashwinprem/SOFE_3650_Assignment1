public class Banana implements GroceryProductFactory
{
    private double price;
    
    public void setPrice()
    {
        this.price = ReadDB.getDBPrice("Banana");
    }

    public double getPrice()
    {
        return this.price;
    }
}
