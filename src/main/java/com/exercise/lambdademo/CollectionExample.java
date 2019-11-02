package com.exercise.lambdademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectionExample {
    public static void main(String[] args){
        // 1 for each
        List<String> pointList = new ArrayList();
        pointList.add("1");
        pointList.add("2");
 
        pointList.forEach(System.out::println);

        // 2. Collection sorting
        List<String> humans = new ArrayList();
        humans.add("Toni");
        humans.add("Budi");
        humans.add("Andi");
        System.out.println("Before sorting:"+ humans.toString());
        // a. with anonymous class
        // Collections.sort(humans, new Comparator<String>() {
        //     @Override
        //     public int compare(String h1, String h2) {
        //         return h1.compareTo(h2);
        //     }
        // });


        // b. with lambda 1st
       // Collections.sort(humans, (h1,h2)->h1.compareTo(h2));
        // c. with lambda 2nd
        //  Collections.sort(
        //      humans, Comparator.comparing(h->h));
        // d. with lambda 3rd
        humans.sort((h1,h2)->h1.compareTo(h2));
        System.out.println("After sorting:"+ humans.toString());
        




    }
}