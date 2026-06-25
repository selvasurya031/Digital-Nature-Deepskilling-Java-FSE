package Week__1.Week_1.DecoratorPatternExample.src.com.Decorator;

public class EmailNotifier implements Notifier {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Hi from emailNotifier");
	}

}
