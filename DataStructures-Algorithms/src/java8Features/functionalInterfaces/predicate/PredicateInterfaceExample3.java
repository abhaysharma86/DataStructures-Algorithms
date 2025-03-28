package java8Features.functionalInterfaces.predicate;// Java program to illustrate
// passing Predicate into function 

import java.util.function.Predicate; 
class PredicateInterfaceExample3 { 
	static void pred(int number, Predicate<Integer> predicate) 
	{ 
		if (predicate.test(number)) { 
			System.out.println("Number " + number); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		pred(10, (i) -> i > 7); 
	} 
} 
