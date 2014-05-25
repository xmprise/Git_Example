package gitRobot;

public class Arm {
int runCount = 0;
	
	private String State(){
		if(runCount >= 10){
			return "NO";
		}else{
			runCount++;
			return "OK";
		}
	}
	
	public void grab(Hand hand){
		if(hand instanceof Hand == true){
			hand.grab();
		}
	}
}
