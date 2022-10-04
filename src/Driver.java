
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "0123";
		String test2 = " 0123";
		String test3 = "0n3";
		String test4 = "0";
		String test5 = "0123456";
		
		Driver d = new Driver();
		
		System.out.println(d.validate(test1));
		System.out.println(d.validate(test2));
		System.out.println(d.validate(test3));
		System.out.println(d.validate(test4));
		System.out.println(d.validate(test5));

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

}
