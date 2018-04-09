package test.testgaurav;

public final class SinglitonClass {

	private static int counter =0;
	private static SinglitonClass obj = null;
	
	 static SinglitonClass getInstance(){
		 
		 if(obj==null){
	synchronized(SinglitonClass.class){		 
		 if(obj==null)
		 {
			 obj = new SinglitonClass();
		 }
		 }
		 }
		return obj;
	}
	
	
	private SinglitonClass(){
		counter++;
		System.out.println(counter);
	}
	
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	
	
	
	
	
}
