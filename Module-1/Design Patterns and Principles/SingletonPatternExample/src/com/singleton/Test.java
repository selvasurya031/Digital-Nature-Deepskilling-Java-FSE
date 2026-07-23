package Week__1.Week_1.SingletonPatternExample.src.com.singleton;

public class Test {
	public static void main(String[] args) {
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		
		System.out.println(l1==l2);
	}

}
