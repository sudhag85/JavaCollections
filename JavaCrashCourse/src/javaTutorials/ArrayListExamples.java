package javaTutorials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
	
	/*Group of individual objects is collection
	Collection is an Interface. It has 3 childrens.
	1.List
	Classes are ArrayList
				LinkedList
				Stack
				Vector
	2.Set
		HashSet
		LinkedHashSet
		TreeSet
	3.Queue

	ArrayList-
	duplicate values are allowed
	Insertion order is maintained.
	underlying DS is resizable array or growable array
	Can insert hetrogeneous object when generics are not used.
	ArrayList and vector implements Randomaccess(retrieval operation), Serializable(which means we can easily transmit via network) and cloneable interfaces.
	Synchronized->No
	Thread Safe->No
	Default Capacity->10
	Fill Ratio or load factor-> 1 0r 100%
	Growth Rate-> current size + currentsize/2
	Best suited for search operations and perform worst on insertion and deletion

	ArrayList is non-Synchronized. Adding a element to the list while traversing will give a concurrent modification exception.*/
	public void example() {
		List <String> arrayList= new ArrayList<String>();
		
		arrayList.add("Java");
		arrayList.add("PHP");
		arrayList.add("Ruby");
		arrayList.add(".Net");
		arrayList.add(".Net");		
		System.out.println(arrayList);//[Java, PHP, Ruby, .Net]
		
		System.out.println(arrayList.get(2));//Ruby
		
		System.out.println(arrayList.indexOf(".Net"));//3
		
		System.out.println(arrayList.lastIndexOf(".Net"));//4
		
		arrayList.add(3, "C#");
		System.out.println(arrayList);//[Java, PHP, Ruby,C#, .Net,.Net]
		
		List<String> anotherArrayList = new ArrayList<String>();
		anotherArrayList.addAll(arrayList);
		System.out.println(anotherArrayList);//[Java, PHP, Ruby, C#, .Net, .Net]
		
		anotherArrayList.add(0, "C");
		System.out.println(anotherArrayList);//[C,Java, PHP, Ruby, C#, .Net, .Net]
		
		anotherArrayList.clear();
		System.out.println(anotherArrayList);//[]
		
		System.out.println(anotherArrayList.isEmpty());//true
		
		anotherArrayList.add(null);
		System.out.println(anotherArrayList);//[null]
		
		anotherArrayList.set(0, "Java");
		System.out.println(anotherArrayList);//[Java]
			
		System.out.println(arrayList.remove(1));//PHP
		
		System.out.println(arrayList);//[Java, Ruby,C#, .Net,.Net]
		
		arrayList.remove(".Net");
		System.out.println(arrayList);//[Java, Ruby, C#, .Net]
		
		System.out.println("-------------------------------");	
		//Using for each loop
		for (String string : arrayList) {
			System.out.println("Print using for each loop " + string);		
		}
	
		System.out.println("-------------------------------");	
		//Using normal for loop
		for(int i=0; i<arrayList.size();i++) {
			System.out.println("Print using for loop " + arrayList.get(i));	
		}
		
		System.out.println("-------------------------------");	
		//Using List Iterator in forward direction 
		ListIterator<String> iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Print using List Iterator in forward direction " + iterator.next());
		}
		
		 //Using List Iterator in reverse direction
		while(iterator.hasPrevious()) {
			System.out.println("Print using List Iterator in reverse direction " + iterator.previous());
		}
		
		System.out.println("-------------------------------");	
		//Using Iterator we can list objects in forward direction only
		
		Iterator iterator1 = arrayList.iterator();
		while (iterator1.hasNext()) {
			System.out.println("Print using Iterator " + iterator1.next());
		}
		
		//ArrayList is non syncronized.
		Iterator iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println("Print using Iterator " + iterator2.next());
			arrayList.add("Perl");//java.util.ConcurrentModificationException
		}
		
	}

	public static void main(String[] args) {
		ArrayListExamples list = new ArrayListExamples();
		list.example();

	}

}
