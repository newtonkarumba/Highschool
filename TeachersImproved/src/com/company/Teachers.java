package com.company;
import java.util.*;

public class Teachers extends Student{
    private String name;
    private String subject;




    public void getName() {
        Teachers teachers = new Teachers();

        Collection collection = new ArrayList();
        collection.add("Bruno");
        collection.add("Pogba");
        collection.add("Kevin");
        collection.add("Sergio");

        Iterator itr = teachers.iterator();
        name = String.valueOf(itr.next());
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    private Iterator iterator() {
        return iterator();
    }



    public void gettSubject(String subject) {
        Teachers teachers = new Teachers();
        Collection collection = new ArrayList();
        collection.add("Bruno teaches English");
        collection.add("Pogba teaches Kiswahili");
        collection.add("Kevin teaches Math");
        collection.add("Sergio teaches French");

        Iterator itr = teachers.iterator();
        subject = String.valueOf(itr.next());
        while (itr.hasNext()) {
            System.out.println(itr.next());


        }
    }
}