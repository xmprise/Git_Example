package gitRobot;

public class Head {
	//private Body body; unused
	private Foot foot = new Foot();
	private Arm arm = new Arm();
	private Hand hand = new Hand();
	private Leg leg = new Leg();;
	
	public void Command(String command){
		switch(command){
		case "walk":
			leg.walk(foot);
			break;
		case "run":
			leg.run(foot);
			break;
		case "grab":
			arm.grab(hand);
			break;
		}
	}
}
