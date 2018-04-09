package test.testgaurav;

public class SimpleClass {

	public static  int counter = 0;
	
	 SimpleClass(){
		++counter;
		System.out.println(counter);
	}
	
	
	public void printMessage(String message){
		System.out.println(message);
	}

}
