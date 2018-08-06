package configuration;

public class MyExceptionClass extends Exception{
	
	
	private static final long serialVersionUID = 1L;
	
	String customMessageToShow;

	public MyExceptionClass(String customMessage) {

			this.customMessageToShow = customMessage;
	}
	
	public String toString(){
	
		
		return "Custom Message : "+customMessageToShow;
	}
	

}
