package java_basic;

public class Quiz1 {
	
	public static void main(String[] args) {
		
		int targetNum = 2341;
		int e0=0;
		int e1=0;
		int e2=0;
		int e3=0;
		
		float tempNum = targetNum / 10000f;
		
		tempNum = tempNum * 10;
		e3 = (int)(tempNum);
		tempNum = tempNum - e3;
		
		tempNum = tempNum * 10;
		e2 = (int)(tempNum);
		tempNum = tempNum - e2;
		
		tempNum = tempNum * 10;
		e1 = (int)(tempNum);
		tempNum = tempNum - e1;
		
		tempNum = tempNum * 10;
		e0 = (int)(tempNum + 0.5);
		tempNum = tempNum - e0;
		
		System.out.println("�Է� ���� : "+targetNum);
		System.out.println("4�ڸ� �� : "+e3);
		System.out.println("3�ڸ� �� : "+e2);
		System.out.println("2�ڸ� �� : "+e1);
		System.out.println("1�ڸ� �� : "+e0);
		
	}
}


