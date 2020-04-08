package regexTutorials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) {

		String mobileNo = "6678923478";
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m = p.matcher(mobileNo);
		if(m.find()) {
			System.out.println("Given mobile number is valid");
		}else {
			System.out.println("Given mobile number is not valid");
		}
	}

}
