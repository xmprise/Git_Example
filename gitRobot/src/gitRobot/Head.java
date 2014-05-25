package gitRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Head{
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String commandMessage;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("Enter Command");
			
			commandMessage = br.readLine();
			
			if(commandMessage.equals("Exit")){
				break;
			}
			
			switch(commandMessage){
			case "Run" :
				
				break;
			}
		}
		
	}

}
