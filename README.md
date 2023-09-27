<hr>

# SOFE3650 - Assignment #1

<ins>**Implementations of Abstract Factory Pattern and Factory Method Pattern (UML, Java)**</ins>

<ins>*Wednesday, September 27, 2023*</ins>

*Assign. Exercise Gp. 6:*

|Name|Student #|
|:---:|:---:|
|Noah Toma|100825559|
|Verina Bouls|100789655|
|Ashwin Prem|100805031|

<br>

## Structure

This repository contains all submission files as per the requirements outlined in the assignment.

The main directory features both subdirectories and files.  The first subdirectory contains the Java source code, and is labeled 'Design Patterns'.  The second subdirectory includes all raw image files that depict the output of the Java implementation, and is labeled 'Output'.  The third subdirectory is titled 'UML', and contains both a PNG and JPEG image file depicting the completed UML diagram of the design pattern architecture.  The files contained in the main directory include this Markdown document (titled 'README.md'), the rubric provided for this assignment (titled 'Assign1-Design Patterns.pdf'), and a '.gitignore' file to prevent unnecessary file commits.

'Design Patterns' contains all necessary project files, including all necessary '.java' and '.txt' source code files.  One of the subdirectories in this folder is labeled 'Test', and includes a test file ('Main.java') that serves as a means of analyzing the Java implementation by providing meaningful output.  This output, as well as the code itself, is captured in this document, as well as in the 'Output' folder.

<br>

## Source Code + Output

|*Main.java*: Source Code|*Main.java*: Output|
|:---:|:---:|
|![Java File](Output/Main_Class.JPG)|![Output](Output/Main_Output.JPG)|

<ins>*Source Code as Text:*</ins>

```
import java.text.DecimalFormat;

public class Main 
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("0.00");

        GroceryStoreSupplier appleFactory = new AppleHarvester();
        GroceryProductFactory apple = appleFactory.gatherFruit();

        System.out.println("\nA new apple was created");

        GroceryStoreSupplier bananaFactory = new BananaHarvester();
        GroceryProductFactory banana = bananaFactory.gatherFruit();

        System.out.println("\nA new banana was created\n");

        System.out.println("Apple's cost: $" + df.format(apple.getPrice()));
        System.out.println("Banana's cost: $" + df.format(banana.getPrice()));
    }
}
```

<br>

## UML Diagram:

![UML Diagram](UML/UML.jpeg)

<hr>