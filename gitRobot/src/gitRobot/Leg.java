package gitRobot;

public class Leg {
	int runCount = 0;
	
	public String legState(){
		if(runCount >= 10){
			return "NO";
		}else{
			runCount++;
			return "OK";
		}
	}
	
	public void run(){
		
	}
}
