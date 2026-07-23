package Week__1.Week_1.FactoryMethodPatternExample.src.com.Factory;

public class WordDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new WordDocument();
	}

}
