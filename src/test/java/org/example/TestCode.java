package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class TestCode {
    @Test
    void isPrime_Test() {
        Prime obj=new Prime();
        assertEquals(obj.isPrime(5), true);
        assertFalse(obj.isPrime(-2), "Not Checking Negative Numbers");
    }

    @Test
    void ArrayList_Test(){
        ArrayList_demo obj=new ArrayList_demo();


        ArrayList <Student>al=new ArrayList<Student>();
        al.add(new Student("Hamza", 23, "BCSF19A519"));
        al.add(new Student("Arham", 29, "BITF18A532"));
        al.add(new Student("Maham", 23, "BSEF17A533"));

        ArrayList<Student> test = obj.Add_Students(new Student("Hamza", 23, "BCSF19A519"),
                new Student("Arham", 29, "BITF18A532"),
                new Student("Maham", 23, "BSEF17A533"));

        /**assertEquals(obj.Add_Students(new Student("Hamza", 23, "BCSF19A519"),
        new Student("Arham", 29, "BITF18A532"),
        new Student("Maham", 23, "BSEF17A533")),al);

         assertEquals(test,al);**/

        assertEquals(obj.equalArrayLists(test,al),true);

    }



}