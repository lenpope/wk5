package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		for (char c : message.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
	} 

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		
	System.out.print("E R R O R : ");
    for (char c : message.toCharArray()) {
        System.out.print(c + " ");
    }
    System.out.println();
	}
}