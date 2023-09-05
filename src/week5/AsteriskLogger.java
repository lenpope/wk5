package week5;

class AsteriskLogger implements Logger {

	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("***" + message + "***");
	}

	public void error(String message) {
		// TODO Auto-generated method stub
		  String border = "****************";
		  System.out.println(border);
		  System.out.println("***Error: " + message + "***");
		  System.out.println(border);	  
	}
}
