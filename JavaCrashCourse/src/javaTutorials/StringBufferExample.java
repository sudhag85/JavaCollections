package javaTutorials;

public class StringBufferExample {

/*	1. An object represents sequence of characters.
	eg. sudha represents sequence of 5 characters.
	2. String Buffer is mutable object,
	which means, if  we create a object using string buffer and if we do any 
	modification, new object will not be created. existing object will be overwritten
	3.String buffer is a child of CharSequence interface
	4.String buffer is synchronised/Thread safe(doesnot support multi threading)*/
//	Synchronised means 2 threads cannot call the methods of String Buffer simulataneously.
	//String Buffer is less efficient than String Builder
	
	public static void main(String[] args) {
		//Diff b/w String Buffer and String
		StringBuffer buffer = new StringBuffer("Sudha");
		System.out.println(buffer);
		buffer.append("Yog");//SudhaYog
		System.out.println(buffer);//SudhaYog
		
		String text1 = "Sadhana";
		text1.concat("Yog");//SadhanaYog
		System.out.println(text1);//Sadhana
		
		System.out.println("----------------------");
		System.out.println(buffer.reverse());
		buffer.reverse();//goYahduS
		
		System.out.println(buffer.replace(0, 5, "Aadhav"));//AadhavYog
		buffer.insert(9, "Child");
		System.out.println(buffer);//AadhavYogChild
		
		buffer.delete(9, 14);
		System.out.println(buffer);//AadhavYog
		
		System.out.println(buffer.capacity());//21
		System.out.println(buffer.charAt(8));//g
			

	}

}
