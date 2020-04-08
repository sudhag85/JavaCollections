package javaTutorials;

public class StringExample {

	/*1. An object represents sequence of character values.
	eg. sudha represents sequence of 5 characters.
	2. String Buffer is immutable object,
	which means,it is constant and cannot be changed once it is created
	3.java.lang.String class implements Serializable, Comparable and CharSequence interfaces
	 */

	public static void main(String[] args) {
		String text1 = "Sudha";//1 way of creating string
		String text2 = new String("Yog");//another way to create string
		int number=3;

		//String Methods
		//returns character value for particular index
		System.out.println(text1.charAt(0));//S

		//returns length of the string
		System.out.println(text1.length());//5

		//checks equality of the string with the given object
		System.out.println(text1.equals(text2));//false

		//checks equality of the string with the given object without case sensitivity
		System.out.println(text1.equalsIgnoreCase("sudha"));//true

		//Checks if the string is empty or not
		System.out.println(text1.isEmpty());//false

		//returns true or false based on the given value is present or not
		System.out.println(text1.contains("a"));//true

		//retrieves particular portion of the string
		System.out.println(text1.substring(2));//dha

		//retrieves particular portion of the string begin and end index
		System.out.println(text1.substring(2,4));//dh

		//appends the string to the given string
		System.out.println(text1.concat(text2));//SudhaYog

		//replaces existing char with given char
		System.out.println(text1.replace("u", "a"));//sadha


		//finds the position of a character in the string
		System.out.println(text1.indexOf("u"));//1

		//finds the position of the charcter from the given position
		System.out.println(text1.indexOf("a", 1));//4
		System.out.println(text1.indexOf("ha", 1));//3

		//removes space before and after
		System.out.println(text1.trim());//Sudha

		//Convert given datatype to String
		System.out.println(String.valueOf(number));//3

		//uppercase
		String uppercase  = "sadhanayog";
		System.out.println(uppercase.toUpperCase());//SADHANAYOG

		//lowercase
		String lowercase = "AADHAVYOG";
		System.out.println(lowercase.toLowerCase());//aadhavyog
		
		//returns a joined string with given delimiter
		System.out.println(String.join("/", "01","11","2015"));//01/11/2015
		System.out.println(String.join("_", "My","mom","is","great"));//My_mom_is_great
		
		//split
		String splitThis = "I am mom of SADHANA and AADHAV";
		String[] splittedWords = splitThis.split(" ");
		for (String string : splittedWords) {
			System.out.println(string);
		}
	}

}
