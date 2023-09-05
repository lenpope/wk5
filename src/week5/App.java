package week5;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		 
		((Logger) asteriskLogger).log("Hello");
        asteriskLogger.error("Hello");
        
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
	}
}