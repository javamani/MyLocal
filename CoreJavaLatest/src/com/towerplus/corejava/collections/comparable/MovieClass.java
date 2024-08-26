package com.towerplus.corejava.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieClass implements Comparable<MovieClass> {
	
	private String name;
	private int year;
	private double revenue;

	@Override
	public int compareTo(MovieClass obj) {
		
		//return this.name.compareTo(obj.getName());
		//return (int) (this.revenue - obj.revenue);
		if (this.revenue - obj.revenue == 0)
				return 0;
		else if(this.revenue > obj.revenue ) {
			return 1;
		}
		else if(this.revenue < obj.revenue) {
			return -1;
		}
		return 0;
	}
	
	public MovieClass() {
		
	}
	
	public MovieClass(String name, int year, double revenue) {
		super();
		this.name = name;
		this.year = year;
		this.revenue = revenue;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	public static void main(String args[]) {
		MovieClass movieObj = new MovieClass();
		List<MovieClass> movieList = new ArrayList<MovieClass>();
		movieList.add(new MovieClass("movie1", 1980,23.5));
		movieList.add(new MovieClass("movie3", 1979,22.5));
		movieList.add(new MovieClass("movie2", 1985,26.5));
		
		for(MovieClass movie : movieList) {
			System.out.println("Movie before sorting " + movie.getName() + "_  " + movie.getYear() + " _ " + movie.getRevenue());
		}
		Collections.sort(movieList);
		for(MovieClass movie : movieList) {
			System.out.println("Movie before sorting " + movie.getName() + "_  " + movie.getYear() + " _ " + movie.getRevenue());
		}
	}

}
