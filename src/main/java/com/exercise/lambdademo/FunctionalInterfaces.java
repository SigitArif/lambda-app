package com.exercise.lambdademo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces{

    public static void main(String[]args){
        // Anonymous class implementation
        Consumer<String> consumer = new Consumer(){

            @Override
            public void accept(Object t) {
                // TODO Auto-generated method stub
                System.out.println(t);
            }

        };
        // Lambda 1st 
        Consumer<String> consumer2 = (String s) ->{
             System.out.println(s);
        };
        // Lambda 2nd
        Consumer<String> consumer3 = s -> System.out.println(s);

        // Lambda 3rd
        Consumer<String> consumer4 = FunctionalInterfaces::print;

        consumer.accept("Hello Consumer");
        consumer2.accept("Hello Consumer 2");;
        consumer3.accept("Hello Consumer 3");
        consumer4.accept("Hello Consumer 4");
        Supplier<String> supplier = new Supplier(){

            @Override
            public Object get() {
                // TODO Auto-generated method stub
                return "Hello Supplier";
            }

        };
        System.out.println(supplier.get());

        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                
                // TODO Auto-generated method stub
                return t%2==0;
            }

        };
        System.out.println(predicate.test(8));
    
        Function<String, String> function = new Function<String, String>(){

            @Override
            public String apply(String t) {
                // TODO Auto-generated method stub
                return t.toUpperCase();
            }
            
        };
        System.out.println(function.apply("hello world"));
    }

    static void print(String s){
        System.out.println(s);
    }

    
}