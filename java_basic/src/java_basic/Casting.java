package java_basic;

public class Casting {

	public static void main(String[] args) {
		
		byte b = 13;
		short s = 3;
		int i = 2;
		long l = 9l;
		float f = 2f;
		double d = 2;
		
		b = (byte)i;
		
		System.out.println(b);
		
		
		
		System.out.println(s+i);
		System.out.println(s/i);
		
		System.out.println(s+f);
		System.out.println(s/f);
		
		System.out.println("¸ò : "+ s/i);
		System.out.println("³ª¸ÓÁö : "+ s%i);

	}

}
