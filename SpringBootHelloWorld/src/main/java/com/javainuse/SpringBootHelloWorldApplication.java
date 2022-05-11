package com.javainuse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javainuse.domain.Expense;
import com.javainuse.repository.ExpenseRepository;

@SpringBootApplication
public class SpringBootHelloWorldApplication implements CommandLineRunner {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		
		/*
		 * expenseRepository.save(new Expense("breakFast" , 5));
		 * expenseRepository.save(new Expense("Lunch" , 25)); expenseRepository.save(new
		 * Expense("Dinner" , 15));
		 */
		
		System.out.println("Execution completed");
		 Iterable<Expense> iterator = expenseRepository.findAll();
         
	        System.out.println("All expense items: ");
	        iterator.forEach(item -> System.out.println(item));
	         
	        List<Expense> breakfast = expenseRepository.findByItem("breakfast");
	        System.out.println("\nHow does my breakfast cost?: ");
	        breakfast.forEach(item -> System.out.println(item));
	         
	        List<Expense> expensiveItems = expenseRepository.getExpenseGreater(5);
	        System.out.println("\nExpensive Items: ");
	        expensiveItems.forEach(item -> System.out.println(item));
		
	}
}
