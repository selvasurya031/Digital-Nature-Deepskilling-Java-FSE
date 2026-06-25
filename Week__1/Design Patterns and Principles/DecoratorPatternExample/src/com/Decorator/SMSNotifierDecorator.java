package Week__1.Week_1.DecoratorPatternExample.src.com.Decorator;

public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier notifier) {
		super(notifier);
	}
	private void smsnotifier() {
		System.out.println("And SMS Notifier");
	}
	@Override
	public void send() {
		super.send();
		smsnotifier();
	}
}


