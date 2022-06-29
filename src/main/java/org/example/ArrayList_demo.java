package org.example;
import java.util.ArrayList;

public class ArrayList_demo {

    ArrayList Add_Students(Student st1,Student st2,Student st3){

        ArrayList<Person> stList=new ArrayList<Person>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);


        for(int i=0;i< stList.size();i++)
        {
            Student demo_obj = (Student) stList.get(i);
            System.out.println("Student "+ (i+1) +": " +demo_obj.getName() +" "+ demo_obj.getAge() + " " + demo_obj.getRollNumber());
        }

        System.out.println("Size of Array List: " + stList.size());

        return stList;

    }
    boolean equalArrayLists (ArrayList<Student> test,ArrayList<Student> al)
    {
        if(test.size()!=al.size())
            return false;

        for(int i=0;i<test.size();i++)
        {
            if(al.get(i).getName()==test.get(i).getName())
                if(al.get(i).getAge()==test.get(i).getAge())
                    if(al.get(i).getRollNumber()==test.get(i).getRollNumber())
                        continue;
        }
        return true;
    }
}
