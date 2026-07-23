package Week__1.Week_1.ProxyPatternExample.src.Code;

public class ProxyImage implements Image {
	RealImage realimage;
	String fileName;
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realimage == null) {
			realimage = new RealImage(fileName);
			
		}
		realimage.display();

	}

}
