package com.javainuse.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* authorname Administrator
*/
@Entity
	public class Expense {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "ITEM")
    private String item;
	
	//@Column("AMOUNT")
	private float amount;
	
    public String getItem() {
		return item;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", item=" + item + ", amount=" + amount + "]";
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}


    
    public Expense() {
    }
 
    public Expense(String item, float amount) {
        this.item = item;
        this.amount = amount;
    }
}
