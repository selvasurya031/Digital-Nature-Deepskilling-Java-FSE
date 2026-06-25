package Week__1.Week_1.SingletonPatternExample.src.com.singleton;

public class Logger {
	private static Logger instance;
	private Logger() {
		System.out.println("Hi form Logger");
	}
	public static Logger getInstance() {
		if(instance == null) {
			return instance = new Logger();
		}
		return instance;
	}

}
