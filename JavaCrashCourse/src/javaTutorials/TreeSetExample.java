package javaTutorials;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

/*	1.Tree Set is implementation class for SortedSet(I) and NavigableSet(I)
	2. Duplicate values are not allowed
	Null values are not allowed after Java1.6 version
	3. Elements are retrieved in natural sorting order
	4. Underlying DS is binary search tree
	5. Heterogenous objects are not allowed, if added class cast exception will occur*/
	//Note- Most of the wrapper classes implemented comparable interface except StringBuffer and StringBuilder
	
	public void basicExample() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(7);
		treeSet.add(2);
		treeSet.add(0);
		treeSet.add(9);
		//Natural sorting order and duplicate not allowed
		System.out.println(treeSet);//[0, 1, 2, 3, 7, 9]
		
		System.out.println(treeSet.descendingSet());//[9, 7, 3, 2, 1, 0]
		
		System.out.println("First Element "+ treeSet.first());//0
		
		System.out.println("Last Element "+ treeSet.last());//9
		
		System.out.println("Values lesser than given value " + treeSet.headSet(7));//[0, 1, 2, 3]
			
		System.out.println("Values equal to and higher than given value " + treeSet.tailSet(3));//[3, 7, 9]
			
		System.out.println("Subset Values " + treeSet.subSet(2, 9));//[2, 3, 7]
		
		System.out.println(treeSet.pollFirst());//0
		
		System.out.println(treeSet.pollLast());//9
		
		System.out.println("After Poll" + treeSet);//[1, 2, 3, 7]
		
		System.out.println("Next higher value "+ treeSet.higher(2));//3
		
		System.out.println("Next higher value "+ treeSet.lower(3));//2
		
		//Normal Iterator
		Iterator<Integer> iterator1 = treeSet.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		//Descending Iterator
		Iterator<Integer> iterator2 = treeSet.descendingIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		//ClassCast Exception
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>();
		set.add(new StringBuffer("B"));
		set.add(new StringBuffer("A"));
		System.out.println(set);
		
		
	}
	
	public static void main(String[] args) {
		TreeSetExample tse = new TreeSetExample();
		tse.basicExample();

	}

}
