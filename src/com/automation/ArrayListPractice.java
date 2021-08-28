package com.automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("Java");
        ar1.add("Python");
        ar1.add("Java Script");
        ar1.add("Database");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Manual Testing");
        ar2.add("Automation Testing");
        ar2.add("Selenium");
        ar2.add("TestNG");

//        ar1.addAll(ar2);
//        System.out.println(ar1);
        ar1.addAll(3, ar2);
        System.out.println(ar1);
//        ar1.clear();
//        System.out.println(ar1);
        ArrayList<String> clone = (ArrayList<String>) ar1.clone();
        System.out.println(clone);
        boolean b = ar1.contains("Selenium");
        boolean c = ar1.contains("Selenium");
        boolean d = ar2.contains("Database");

        System.out.println(d);

        System.out.println(ar1.indexOf("Python") > 3);

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Tim", "Tom", "vag", "Tim", "Lisa", "Tim"));
        System.out.println(list1);
        int i = list1.lastIndexOf("Tim");
        System.out.println(i);
        int j = list1.lastIndexOf("dick");
        System.out.println(j);
        list1.remove(2); // remove by index
        list1.remove("vag"); // remove direct by name
        System.out.println(list1);

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("odd numbers:" + numbers);

        numbers.removeIf(num -> num % 2 != 0);
        System.out.println("Even numbers:: " + numbers);
        
        
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Hot","cold","Tom","Rain","Tom","Winter","Tom","Spring"));
//        namesList.retainAll(Collections.singleton("Tom"));
//        System.out.println(namesList);

        ArrayList<Integer> mainList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14));
        ArrayList<Integer> subList = new ArrayList<Integer>(mainList.subList(2,6));
        System.out.println(subList);

        Object arr[] = namesList.toArray();
        System.out.println(Arrays.toString(arr));

        for(Object o : arr)
        {

            System.out.println(o);
        }



    }
}
