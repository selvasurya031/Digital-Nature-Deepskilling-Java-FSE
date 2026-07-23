package Week__1.Week_1.DecoratorPatternExample.src.com.Decorator;

public abstract class NotifierDecorator implements Notifier {
	protected Notifier notifier;
	public NotifierDecorator(Notifier notifier) {
		super();
		this.notifier = notifier;
	}
	@Override
	public  void send() {
		// TODO Auto-generated method stub
		notifier.send();
	}
}
