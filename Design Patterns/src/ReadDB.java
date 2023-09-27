import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadDB {
    public static double getDBPrice(String name)
    {
        double fruitPriceFromDB = 1;
         try
        {
            File file = new File("src/DB.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNext())
            {
                String db_Name = scan.next();
                if (db_Name.equals(name) && scan.hasNextDouble())
                {
                    fruitPriceFromDB = scan.nextDouble();
                    break;
                }
                else {
                    if (scan.hasNextDouble())
                        scan.nextDouble();
                }
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
