package com.telran.org.lesson6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleTwo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("black");
        stringList.add("Green");
        stringList.add("Pink");
        stringList.add("Red");
        System.out.println(stringList);

        ArrayList<String> stringListToLowerList = toLowerCase(stringList);
        System.out.println("new list " + stringListToLowerList);

        toLowerCaseInPlace(stringList);
        System.out.println("original list " + stringList);
    }

    private static ArrayList<String> toLowerCase(List<String> stringList) { // change list meanings not creating new shablon
        ArrayList<String> newList = new ArrayList<>();
        for (String value : stringList) {
            String newString = value.toLowerCase();
            newList.add(newString);
        }
        return newList;
    }
    private static void toLowerCaseInPlace(List<String> stringList)
    {
        for (int i = 0; i<stringList.size(); i++) {
            String value = stringList.get(i);
            String newString = value.toLowerCase();
            stringList.set(i,newString);
        }
    }
}
