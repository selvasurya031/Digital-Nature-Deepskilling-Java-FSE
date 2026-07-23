package Week__1.Week_1.DecoratorPatternExample.src.com.Decorator;

public class TestDecorator {
	public static void main(String[] args) {
        System.out.println("Email Only:");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send();

        System.out.println();

        System.out.println("Email + slack:");
        Notifier slackNotifier =
                new SlackNotifierDecorator(new EmailNotifier());
        slackNotifier.send();
        System.out.println();
        System.out.println();

        System.out.println("Email + SMS + Slack:");
        Notifier multiNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        multiNotifier.send();
	}
}
