package java_basic;

public class StrTest {

	public static String change(String str) {
		str += "456";
		return str;
	}

	public static void main(String[] args) {
		String str = new String("ABC123");
		System.out.println(str);
		change(str);
		
		System.out.println("After change:" + str);
	}

}
