package Week__1.Week_1.FactoryMethodPatternExample.src.com.Factory;

public class PdfDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new PdfDocument();
	}

}
