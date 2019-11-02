package com.exercise.lambdademo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        List<String> salaries = new ArrayList();
        salaries.add("1000");
        salaries.add("2000");
        salaries.add("500");
        salaries.add("Agus");
        salaries.add("Budi");
        
        Predicate<String> numberFilter = Pattern
                                        .compile("\\d+")
                                        .asPredicate();
        List<Integer> newSalaries = 
                salaries.stream()
                .filter(numberFilter)
                .map(Integer::parseInt)
                .filter(m->m>600)
                .sorted((s1, s2)-> s1-s2)
                .collect(Collectors.toList());
        System.out.println("Before filtering: " + salaries.toString());
        System.out.println("After filtering: " + newSalaries.toString());

    }
}