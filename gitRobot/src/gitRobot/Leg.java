package gitRobot;

public class Leg {
	int runCount = 0;
	
	private boolean state(){
		if(runCount >= 2){
			return false;
		}else{
			runCount++;
			return true;
		}
	}
	
	public void walk(Foot foot){
		if(foot instanceof Foot == true && state() == true){
			foot.walk();
		}
		else{
			System.out.println("I'm not carry out your command. sorry");
		}
	}
	
	public void run(Foot foot){
		if(foot instanceof Foot == true){
			foot.run();
		}
	}
}
