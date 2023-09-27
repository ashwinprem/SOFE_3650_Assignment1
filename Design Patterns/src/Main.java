import java.text.DecimalFormat;

public class Main 
{
    public static void main(String[] args) 
    {
        DecimalFormat df = new DecimalFormat("0.00");

        GroceryStoreSupplier appleFactory = new AppleHarvester();
        GroceryProductFactory apple = appleFactory.gatherFruit();

        System.out.println("A new apple was created\n");

        GroceryStoreSupplier bananaFactory = new BananaHarvester();
        GroceryProductFactory banana = bananaFactory.gatherFruit();

        System.out.println("A new banana was created\n");

        System.out.println("Apple's cost: $" + df.format(apple.getPrice()));
        System.out.println("Banana's cost: $" + df.format(banana.getPrice()));

    }
}