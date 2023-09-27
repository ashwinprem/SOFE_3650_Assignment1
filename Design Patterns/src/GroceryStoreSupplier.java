public abstract class GroceryStoreSupplier
{
    public GroceryProductFactory gatherFruit()
    {
       GroceryProductFactory fruit = createFruit();
       fruit.setPrice();
       return fruit;
    }

    public abstract GroceryProductFactory createFruit();
}
