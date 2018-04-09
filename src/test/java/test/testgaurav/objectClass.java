package test.testgaurav;

public class objectClass {

	public static void main(String args[]){
		SinglitonClass s1 = SinglitonClass.getInstance();
		s1.printMessage("i am s1");
		
		
		
		SinglitonClass s2 = SinglitonClass.getInstance();
		s2.printMessage("i am s2");
		
		System.out.println("value 1 -> " + s1 + " - "+ s2 );
		
		
	}
}
