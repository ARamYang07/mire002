package java_basic;

public class Gugudan {

	public static void main(String[] args) {
		
		String result="";
		
		for (int dan=2; dan < 10; dan++) {
			for (int gop=1; gop <10; gop++) {
				result = result +(dan + "*"+gop+"="+(dan*gop)+"\n");
			}
			result = result + "\n";
		}
		
		
		System.out.println(result);

	}

}
