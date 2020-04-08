package regexTutorials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecificWord {

	public static void main(String[] args) {
		String sentence = "My name is Sudha wife of Yog. My daughter name is Sadhana and my Son name is Aadhav.";
		Pattern p = Pattern.compile("name");
		Matcher m = p.matcher(sentence);
		int count = 0;
		while(m.find()) {
			System.out.println(m.group() + " Name starts at: "+m.start()+" and ends at: "+m.end());
			count++;
		}
		System.out.println("Number of times name is displayed is: "+count);

	}

}
