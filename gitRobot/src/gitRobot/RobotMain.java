package gitRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotMain{
	
	public static void main(String[] args) throws IOException {
		String commandMessage;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Head head = new Head();
		while(true){
			System.out.println("Enter Command");
			
			commandMessage = br.readLine();
			
			if(commandMessage.equals("Exit")){
				break;
			}
			
			switch(commandMessage){
				case "walk" :
					head.Command("walk");
					break;
				case "run" :
					head.Command("run");
					break;
				case "grab" :
					head.Command("grab");
					break;
				default : 
					System.out.println("invalid command");
					break;
			}
		}
		
	}

}
