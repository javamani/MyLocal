package com.javainuse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.javainuse.domain.Expense;

/**
* authorname Administrator
*/

public interface ExpenseRepository  extends CrudRepository<Expense, Long>{
	
	public List<Expense> findByItem(String Item);
	
	@Query("select e from Expense e where e.amount >= :price")
	public List<Expense> getExpenseGreater(@Param("price") float amount);

}
