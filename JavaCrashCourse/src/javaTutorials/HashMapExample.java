package javaTutorials;

import java.util.HashMap;

public class HashMapExample {
//Map
/*	1.Map is not child interface of collection
	2. It represents data in key value pair
	3. Duplicate keys are not allowed
	4. Duplicate values are allowed
	*/
	
	
	//HashMap
	/*1. Hash Map is the implementation class for Map(I)
	2. Duplicate keys are not allowed but duplicate values are allowed
	3. Uses a technique called hashing to store elements
	4. Only one null key is allowed
	5. The order is not preserved as it uses hashing, so we cant predict the order of elements inserted
	6. A value of map can only be fecthed using its key
	7. It is not synchronised, so it cannot be used in multi threading environment
	8. Initial Capacity is 16 and load factor is 75
	*/
	
	
	public void basicExample() {
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(1, "OMKumar");
		hashmap.put(2, "Lakshu");
		hashmap.put(3, "Sadhana");
		hashmap.put(4, "Aadhav");
		
		System.out.println(hashmap);//{1=OMKumar, 2=Lakshu, 3=Sadhana, 4=Aadhav}
		
		HashMap<Integer,String> hashmap1 = new HashMap<Integer,String>();
		hashmap1.putAll(hashmap);
		System.out.println("Makes a copy of existing map" + hashmap1);//{1=OMKumar, 2=Lakshu, 3=Sadhana, 4=Aadhav}
		
		hashmap1.clear();
		System.out.println(hashmap1);//{}
				
		System.out.println("To check if a key is present or not in the map " +hashmap.containsKey(2));//true
				
		System.out.println("To check if a value is present or not in the map "+ hashmap.containsValue("Sadhana"));//true
		
		System.out.println("Cloned Map " + hashmap.clone());//{1=OMKumar, 2=Lakshu, 3=Sadhana, 4=Aadhav}
		
		System.out.println("Fetch set of key from the map "+ hashmap.keySet());//[1, 2, 3, 4]
		
		System.out.println("To fetch a value " + hashmap.get(2));//Lakshu
				
		System.out.println("To fetch all values " + hashmap.values());//[OMKumar, Lakshu, Sadhana, Aadhav]
		
		System.out.println(hashmap.entrySet());//[1=OMKumar, 2=Lakshu, 3=Sadhana, 4=Aadhav]
		
		
		
	}
	public static void main(String[] args) {
		HashMapExample hme = new HashMapExample();
		hme.basicExample();

	}

}
