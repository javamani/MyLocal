package com.towerplus.corejava.optional;

import java.util.Optional;

public class OptionalChaining {
	
	public static void main(String args[]) {
		
		User user = new User("Mani" , null);
		
		String city = Optional.ofNullable(user).map(User::getAddress).map(Address::getCity).orElse("Unknown City");
	
		System.out.println("City value is " + city);
	}
	
}
	class User {
		
		public User(String name, Address address) {
			super();
			this.name = name;
			this.address = address;
		}
		String name;
		Address address;
		
		public String getName() {
			return name;
		}
		public Address getAddress() {
			return address;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
	}
	
	class Address {
		String city;
		public Address(String city, String state) {
			super();
			this.city = city;
			this.state = state;
		}
		String state;
		
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		
	}


