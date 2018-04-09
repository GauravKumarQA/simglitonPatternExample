package test.testgaurav;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Timmer {

	
	static long build1;
	static String timer;
	static long build;
	static long build2;
	
	
	
	public void startTimmer(String clockName){
		 timer = clockName;
		 build1 = getCurentTimeInSeconds();
	}
	
	public String  stopTimmer(String clockName){
		if(clockName.equals(timer)){
			 build2 = getCurentTimeInSeconds();
			 String data = String.valueOf(build2 - build1);
			 
			 return data;
		}
		else{
			return "Enter clockNameCorrect";
		}
	}
	
	public long getCurentTimeInSeconds(){
		 Calendar c = Calendar.getInstance();
		 SimpleDateFormat sdf1 = new SimpleDateFormat("ss");
		 SimpleDateFormat sdf2 = new SimpleDateFormat("mm");
		 SimpleDateFormat sdf3 = new SimpleDateFormat("hh");
		 build = Integer.parseInt(sdf1.format(c.getTime())) +(Integer.parseInt(sdf2.format(c.getTime()))*60)+ (Integer.parseInt(sdf3.format(c.getTime()))*3600);			
		 return build;
	}
	
}
