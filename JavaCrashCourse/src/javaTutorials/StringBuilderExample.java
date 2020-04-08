package javaTutorials;

public class StringBuilderExample {

	/*	1. An object represents sequence of characters.
	eg. sudha represents sequence of 5 characters.
	2. String Builder is mutable object,
	which means, if  we create a object using string buffer and if we do any 
	modification, new object will not be created. existing object will be overwritten
	3.String builder is a child of CharSequence interface
	4.String builder is non-synchronised/not thread safe(support multi threading)*/
	//	Non-Synchronised means 2 threads can call the methods of String Builder simulataneously.
	//String Builder is more efficient than String Buffer


	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Sadhana");
		builder.append("Yog");
		System.out.println(builder);//SadhanaYog

		System.out.println(builder.equals("Yog"));//false
		System.out.println(builder.length());//10
		
		System.out.println(builder.substring(7));//Yog
		System.out.println(builder.substring(0, 7));//Sadhana
		
	}

}
