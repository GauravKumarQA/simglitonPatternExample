package test.testgaurav;

import org.testng.annotations.Test;

public class TestTimmer {

	@Test
	public void testing(){
		
		Timmer time = new Timmer();
		time.startTimmer("test");
		
		try {
			Thread.sleep(67000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(time.stopTimmer("test"));

		
	}
}
