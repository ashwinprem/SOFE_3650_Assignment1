import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadDB 
{
    public static double getDBPrice(String name)
    {
        double fruitPriceFromDB = 1;
        
        try (Scanner sc = new Scanner(new File("src/DB.txt"));)
        {
            while (sc.hasNext())
            {
                String db_Name = sc.next();

                if (db_Name.equals(name) && sc.hasNextDouble())
                {
                    fruitPriceFromDB = sc.nextDouble();
                    break;
                }
                else 
                    if (sc.hasNextDouble())
                        sc.nextDouble();
            }
        }
        catch (FileNotFoundException err)
        {
            System.out.println("Error reading the file");
            err.printStackTrace();
        }
        return fruitPriceFromDB;
    }
}
