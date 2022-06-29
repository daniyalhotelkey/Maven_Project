package org.example;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
      /**  System.out.println("Hello World");
        Scanner in=new Scanner(System.in);

        System.out.println("Is Prime: ");
        int num= in.nextInt();

        Prime obj=new Prime();
        System.out.println(obj.isPrime(num));**/

        ArrayList_demo arrObj = new ArrayList_demo();

        arrObj.Add_Students(new Student("Ali", 21, "BITF19A545"),
                new Student("Hamza", 23, "BCSF19A519"),
                new Student("Haroon", 22, "BSEF19A521"));

    }
}
