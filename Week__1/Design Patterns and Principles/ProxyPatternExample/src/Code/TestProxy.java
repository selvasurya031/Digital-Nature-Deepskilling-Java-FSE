package Week__1.Week_1.ProxyPatternExample.src.Code;

public class TestProxy {
	public static void main(String[] args) {
	String fileName = "Nature.jpg";
	
	Image image = new ProxyImage(fileName);
	
	System.out.println("First Display");
	image.display();
	System.out.println();
	System.out.println("Second Display");
	image.display();
	
	}

}
