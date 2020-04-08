package javaTutorials;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	//Insertion order is maintained

	public void basicExample() {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(1, "Similac");
		lhm.put(3, "Nan");
		lhm.put(2, "Ensure");
		lhm.put(null, "NanPro");
		lhm.put(null, "Pro");
		
		System.out.println(lhm);

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2, "Similac");
		hm.put(1, "Ensure");
		hm.put(3, "Nan");
		hm.put(null, "Pro");
		hm.put(null, "NanPro");
		System.out.println(hm);

	}
	public static void main(String[] args) {
		LinkedHashMapExample lhm = new LinkedHashMapExample();
		lhm.basicExample();
	}

}
