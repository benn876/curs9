package org.fasttrackit.curs9.code.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Object> listOfObjects = new ArrayList<>();
        listOfObjects.add("test");
        listOfObjects.add(45);
        listOfObjects.add(LocalDate.now());

        System.out.println(listOfObjects);
        if (listOfObjects.get(2) instanceof LocalDate) {
            System.out.println(((LocalDate) listOfObjects.get(2)).getYear());
        }

        List<String> names = new ArrayList<>();
        names.add("Mihai");
        names.add("George");
        names.add("Ana");
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }

        System.out.println(names.get(1));
        System.out.println(names.get(1).length());

        LinkedList<String> linkedNames = new LinkedList<>();
        linkedNames.add("Ionel");
        linkedNames.add("Marcus");
        linkedNames.add("Ionela");
        linkedNames.add(2,"Jojo");

        System.out.println(linkedNames);
        System.out.println(linkedNames.get(2));

        System.out.println(names.contains("Ana"));
    }
}
