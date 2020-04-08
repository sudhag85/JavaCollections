package regexTutorials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {


	public void method1() {
		String sentence = "abcbcacabaaabba";
		Pattern p = Pattern.compile("a+");//Atleast 1 match
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}

	
	public void method2() {
		String sentence = "abcbcacabaaabbbabca";
		Pattern p = Pattern.compile("a*");//Any number of match including zero
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}
	
	
	public void method3() {
		String sentence = "abcbcacabaaabbbabca";
		Pattern p = Pattern.compile("a?");//Atmost 1 match
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}
	
	
	public void method4() {
		String sentence = "abcbcacabaaabbbabca";
		Pattern p = Pattern.compile("aa{2}");
	//	Pattern p = Pattern.compile("aa{1,3}");
		Matcher m = p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group() + " starts at: "+m.start()+" and ends at: "+m.end());
		}
	}
	
	
	
public static void main(String[] args) {
	Quantifiers obj = new Quantifiers();
	//obj.method1();
//	obj.method2();
	obj.method3();
}
}