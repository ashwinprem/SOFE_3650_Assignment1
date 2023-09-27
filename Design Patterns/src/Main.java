import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        GroceryStoreSupplier appleFactory = new AppleHarvester();
        GroceryProductFactory apple = appleFactory.gatherFruit();

        System.out.println("A new apple was created\n");

        GroceryStoreSupplier bananaFactory = new BananaHarvester();
        GroceryProductFactory banana = bananaFactory.gatherFruit();

        System.out.println("A new banana was created\n");

        System.out.println("Apple's cost: $" + apple.getPrice());
        System.out.println("Banana's cost: $" + banana.getPrice());

    }
}