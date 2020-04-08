package regexTutorials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedClasses {

	public void method1() {
		String sentence = "Tamil Tamilan TamilNadu 600001 $%^&&";
		Pattern p = Pattern.compile("\\s");
		/*\\s----------Prints space in given sentence
		\\S--------- Prints non space characters
		\\d---------Prints numbers in given sentence
		\\D---------Prints non-Digits characters
		\\w-------Prints alphanumeric expects special characters
		\\W-----Prints special characters including space expects alphanumeric
		\\bTamil-----Prints a word that starts with Tamil
		\\bTamil\\b--------Prints a word that starts with and ends with Tamil
		Tamil\\B------Prints a word that doesn't ends with Tamil
		\\GTamil------Previous match ending regex Eg- TamilTamilian TamilNadu
		\\.-------- Prints all including alphanumeric and special characters*/
		
		
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}


public static void main(String[] args) {
	PredefinedClasses obj = new PredefinedClasses();
	obj.method1();


}

}
