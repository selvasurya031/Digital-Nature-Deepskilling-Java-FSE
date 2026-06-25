package Week__1.Week_1.ProxyPatternExample.src.Code;

public class RealImage implements Image {
	private String fileName;
	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadimage();
	}
	public void loadimage() {
		System.out.println("Image is Loading :"+fileName);
	}
	@Override

	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(fileName);

	}

}
