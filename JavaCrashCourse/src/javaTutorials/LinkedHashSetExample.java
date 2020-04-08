package javaTutorials;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	//LinkedHashSet
		//LinkedHashSet is implementation class for Set
		//duplicate values are not allowed
		//insertion order is maintained
		//Can insert heterogeneous object if generics is not used
		//Null elements are allowed.
		//Underlying DS is Hash table + linked list 
		//Implements serializable and cloneable interfaces
		//Data is stored based on hashcode, so search is very effective
		//Fill ratio or load factor is 75%
		//default capacity is 16
	
	public void basicExample() {
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("Selenium");
		lhs.add("UFT");
		lhs.add("API");
		lhs.add("Appium");
		lhs.add("UFT");
		
		//NO duplication
		System.out.println(lhs);//[Selenium, UFT, API, Appium]
		
		System.out.println(lhs.size());//4
		
		lhs.remove("Appium");
		System.out.println(lhs);//[Selenium, UFT, API]
			
		
	}

	public static void main(String[] args) {
		LinkedHashSetExample lhs = new LinkedHashSetExample();
		lhs.basicExample();

	}

}
