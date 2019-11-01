package com.exercise.lambdademo;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Optional.ofNullable(person.getAge())
        .map(x -> x).orElseThrow(()-> new Exception("Not found"));
       
    }
}