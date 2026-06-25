package Week__1.Week_1.FactoryMethodPatternExample.src.com.Factory;

public class ExcelDocumentFactory extends DocumentFactory {

	public Document createDocument() {
		// TODO Auto-generated method stub
		return new ExcelDocument();
	}

}
