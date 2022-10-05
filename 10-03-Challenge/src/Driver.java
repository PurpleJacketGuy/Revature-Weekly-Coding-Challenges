import java.util.Calendar;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "0123";
		String test2 = " 0123";
		String test3 = "0n3";
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
		
		System.out.println("\nFriday Tests:");
		//Months for Calendar start at 0
		System.out.println(d.has_friday_13(9, 2022));
		System.out.println(d.has_friday_13(4, 2022));

	}
	
	public boolean validate(String s) {
		if(s.length() > 6 || s.length() < 4) {
			return false;
		}
		if(s.contains("^[0-9]") || s.contains(" ")) {
			return false;
		}
		return true;
	}
	
	public  boolean has_friday_13(int m, int y) {
		Calendar c = Calendar.getInstance();
		
		//Sets Calendar instance to give month and year on the 13th.
		c.set(y, m, 13);
		
		//If the DAY_OF_WEEK == 6, then the 13th is on a Friday.
		if(c.get(c.DAY_OF_WEEK)== 6) {
			return true;
		}
		return false;
	}

}
