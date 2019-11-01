package com.exercise.lambdademo;

import lombok.Data;

@Data
public class Person{
    
	private String name;
    private Integer age;
    public Person(String string, int i) {
	}
	public Person() {
	}
}