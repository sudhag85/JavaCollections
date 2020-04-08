package javaTutorials;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	//https://visualgo.net/en
//Linked list is best suited for insertion and deletion and worst for retrieving data
	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(1);
		linkedlist.add(3);
		linkedlist.add(5);
		linkedlist.add(7);
		linkedlist.addFirst(0);
		linkedlist.addLast(6);
		System.out.println(linkedlist);//[0, 1, 3, 5, 7, 6]
		
		linkedlist.removeFirst();
		System.out.println(linkedlist);//[1, 3, 5, 7, 6]
		
		linkedlist.removeLast();
		System.out.println(linkedlist);//[1, 3, 5, 7]
		
		linkedlist.poll();
		System.out.println(linkedlist);//[3, 5, 7]
		
		linkedlist.pollLast();
		System.out.println(linkedlist);//[3, 5]
		
		linkedlist.add(1);
		linkedlist.add(3);
		linkedlist.add(2);
		linkedlist.add(1);
		
		System.out.println(linkedlist);//[3, 5, 1, 3, 2, 1]
		
		linkedlist.removeFirstOccurrence(3);
		System.out.println(linkedlist);//[5, 1, 3, 2, 1]
		
		linkedlist.removeLastOccurrence(1);
		System.out.println(linkedlist);//[5, 1, 3, 2]
		
		//Using simple for loop
		for(int i =0;i<linkedlist.size();i++) {
			System.out.println("Iterate using simple for loop " + linkedlist.get(i));
		}
		
		
		//Using for each loop
		for (Integer integer : linkedlist) {
			System.out.println("Iterate using for each loop " + integer);		
		}
		
		//Using While loop
		int i=0;
		while(i<linkedlist.size()) {
			System.out.println("Iterate using for while loop " + linkedlist.get(i));	
			i++;
		}
		
		//Using Iterator
		Iterator<Integer> iterator1 = linkedlist.iterator();
		while(iterator1.hasNext()) {
			System.out.println("Iterate using for Iterator " + iterator1.next());
		}
		
		ListIterator<Integer> iterator2 =  linkedlist.listIterator();
		while(iterator2.hasNext()) {
		System.out.println("ListIterate using for Iterator " + iterator2.next());	
		}

	}

}
