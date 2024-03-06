package com.ass5.java;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class Listclass {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>(10);
		
		for (int i = 0; i <=14; i++) {
			
			numbers.add(i);
		
		}
		
		for (Integer no : numbers) {
			
			System.out.println(no);
		}
	
		System.out.println("------------------");
	
	    List<Integer> evennumbers = numbers.stream().filter(no ->no%2==0).collect(Collectors.toList());
		
		List<Integer> oddnumbers = numbers.stream().filter(no ->no%2==1).collect(Collectors.toList());
		
		System.out.println("oddnumbers size: "+oddnumbers.size()+", evennumberssize: "+evennumbers.size());
		
		System.out.println("------------------");
		
		System.out.println("even numbers are : " +evennumbers);
		
		System.out.println("odd numbers are : " +oddnumbers);
		
		 }
	
}
