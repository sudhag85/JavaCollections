package regexTutorials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesExample {
	
	public void findStartingWord() {
		String sentence = "My name is Sudha wife of Yog. My daughter name is Sadhana and my Son name is Aadhav.";
		Pattern p = Pattern.compile("^My");
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}
	
	public void findEndingWord() {
		String sentence = "My name is Sudha wife of Yog. My daughter name is Sadhana and my Son name is Aadhav.";
		Pattern p = Pattern.compile(".$");
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());	
		}
		
	}
	
	public void findAny2Character() {
		String sentence = "My name is Sudha wife of Yog. My daughter name is Sadhana and my Son name is Aadhav.";
		Pattern p = Pattern.compile("is|my");
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}
	
	public void groupingOfCharacter() {
		String sentence = "abcbcacabaaabbbcccab";
		Pattern p = Pattern.compile("[ab]");//[^ab],
		//[ab]- prints a and b alone in given sentence
		//[^ab]- print other alphabets other than a and b
		//[a-zA-Z]- prints all alphabets including small and capital
		//[0-9]-Prints numbers alone
		//[a-zA-Z0-9]-Prints alphanumerics
		//[^a-zA-Z0-9]-will not Print alphanumerics. Displays special characters if present
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}

	public static void main(String[] args) {
		CharacterClassesExample obj = new CharacterClassesExample();
		obj.findStartingWord();
		obj.findEndingWord();
		obj.findAny2Character();
		obj.groupingOfCharacter();

	}

}
