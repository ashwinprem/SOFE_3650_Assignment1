public class AppleHarvester extends GroceryStoreSupplier{
    @Override
    public GroceryProductFactory createFruit()
    {
        return new Apple();
    }
}
