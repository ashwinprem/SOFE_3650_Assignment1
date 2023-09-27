public class BananaHarvester extends GroceryStoreSupplier
{
    @Override
    public GroceryProductFactory createFruit()
    {
        return new Banana();
    }
}
