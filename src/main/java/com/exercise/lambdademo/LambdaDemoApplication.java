package com.exercise.lambdademo;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaDemoApplication.class, args);

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
			System.out.println("run() was called!");
			}
			};
			runnable.run();
	}

	Consumer<String> printConsumer = new Consumer<String>() {
		@Override
		public void accept(String s) {
		System.out.println(s);
		}
		};
		


}
