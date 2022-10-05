import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "0123";
		String test2 = " 0123";
		String test3 = "abcd";
		String test4 = "0";
		String test5 = "0123456";
		String test6 = "";
		
		Driver d = new Driver();
		
		System.out.println(d.validate(test1));
		System.out.println(d.validate(test2));
		System.out.println(d.validate(test3));
		System.out.println(d.validate(test4));
		System.out.println(d.validate(test5));
		System.out.println(d.validate(test6));
		
		System.out.println("\nFactorial Tests:");
		System.out.println(d.isFactorial(24));
		System.out.println(d.isFactorial(3));

	}
	
	public boolean validate(String s) {
		
		if(s.length() > 6 || s.length() < 4) {
			return false;
		}
		if(s.contains(" ")) {
			return false;
		}
		
		//Checks to see if the String has any instance of lowercase characters.
		for(int i = 97; i < 123; i++) {
			char c = (char)i;
			if(s.indexOf(c) > -1) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isFactorial(int n) {
		int factorial = 1;
		
		for(int i = 1; factorial <= n; i++) {
			factorial = factorial * (i+1);
			
			if(factorial == n) {
				return true;
			}
		}
		return false;
	}

}
