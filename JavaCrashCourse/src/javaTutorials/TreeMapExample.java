package javaTutorials;

import java.util.TreeMap;

public class TreeMapExample {

	/*1. TreeMap is the implementation class for Map(I)
	2. Duplicate keys are not allowed but duplicate values are allowed
	3. Null key is not allowed whereas in HashMap and Linked Hashmap null values are overwritten
	4. Elements will be retrieved in natural sorting order*/
	
	public void basicExample() {
		TreeMap<String,String> treemap = new TreeMap<String,String>();
		treemap.put("Punggol", "Singapore");
		treemap.put("LittleIndia", "Singapore");
		treemap.put("FarrerPark", "Singapore");
		treemap.put("Sengkang", "Singapore");
		
		treemap.put("Singapore", "Hougang");
		treemap.put("Singapore", "Tampanies");
		
		System.out.println(treemap);
		//{FarrerPark=Singapore, LittleIndia=Singapore, Punggol=Singapore, Sengkang=Singapore, Singapore=Tampanies}
		
		treemap.put(null, "Tampanies");
		System.out.println(treemap);//Null Pointer Exception
		
	}
	public static void main(String[] args) {
		TreeMapExample tme = new TreeMapExample();
		tme.basicExample();

	}

}
