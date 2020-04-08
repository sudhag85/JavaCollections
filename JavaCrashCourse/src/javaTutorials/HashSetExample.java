package javaTutorials;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	//Set
	//Set is one of the child interface of collection
	//duplicate values are not allowed
	//insertion order is not maintained
	//Can insert heterogeneous object if generics is not used
	
	
	//HashSet
	//HashSet is implementation class for Set
	//duplicate values are not allowed
	//insertion order is not maintained
	//Can insert heterogeneous object if generics is not used
	//Null elements are allowed.
	//Underlying DS is Hash table which is actually a HashMap instance
	//Implements serializable and cloneable interfaces
	//Data is stored based on hashcode, so search is very effective
	//Fill ratio or load factor is 75%
	//default capacity is 16
	
	
	//4 constructors available in hashset
/*	HashSet hs = new HashSet();//Size 16, fill ratio 0.75
	HashSet hs1 = new HashSet(int initialSize);//size as declared and default fill ratio is .75
	HashSet hs1 = new HashSet(int initialSize,float fillRatio);//size and fill ratio can be declared
	HashSet hs4 = new HashSet(Collection c);//Creates a hashset for any given collection
	*/
	
	public void HashsetBasicExanple() {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Sudha");
		hs.add("Yog");
		hs.add("Sathya");
		hs.add("Sadhana");
		hs.add(null);
		hs.add("Aadhav");
		hs.add("Yog");
		
		//Insertion order is not mainted and duplicate value is not allowed.
		System.out.println(hs);//[Yog, null, Sudha, Sathya, Aadhav, Sadhana]
		
		System.out.println(hs.contains(null));//true
		
		hs.remove(null);
		System.out.println(hs);//[Yog, Sudha, Sathya, Aadhav, Sadhana]
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("a");
		hs1.add("b");
		hs1.add("c");
		hs1.add("e");
		System.out.println(hs1);//[a, b, c, e]
		
		hs.addAll(hs1);
		System.out.println(hs);//[Yog, a, b, Sudha, c, Sathya, e, Aadhav, Sadhana]
		
		System.out.println(hs.containsAll(hs1));//true
		
		
		//Iterator using iterator
		
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
		System.out.println("Iterate using Iterator " + iterator.next());	
		}
	}
	public static void main(String[] args) {
		
		HashSetExample HSE = new HashSetExample();
		HSE.HashsetBasicExanple();
	}

}
