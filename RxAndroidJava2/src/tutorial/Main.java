package tutorial;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
	
	
	private static void polling(){
		Polling polling = new Polling();
		Timer timer = new Timer();
	    timer.schedule(polling, 0,1000);
	}

	public static void main(String[] args) {
		
		Tutorial android1 = new Tutorial("Hafiz", "........");
		android1.publish();
	    Tutorial android2 = new Tutorial("Hafiz", "........");
	    android2.publish();
	    Tutorial android3 = new Tutorial("Hafiz", "........");
	    android3.publish();

	    	    
	    // I have already three tutorials and later user subscribed for email
		
		User A = new User("A","a@a.com");
	    User B = new User("B","b@a.com");
	    User C = new User("C","c@a.com");
	    User D = new User("D","d@a.com");
	    
	    // Now A,C and D click subscribe button
//	    Tutorial.REGISTER_FOR_SUBSCRIPTION.register(A);
//	    Tutorial.REGISTER_FOR_SUBSCRIPTION.register(C);
//	    Tutorial.REGISTER_FOR_SUBSCRIPTION.register(D);
	    
	    Tutorial android4 = new Tutorial("Hafiz 4", "........");
	    android4.publish();
	    
	    

	}
	
	public static class Polling extends TimerTask {

		@Override
		public void run() {
//			if(lastCountOfPublishedTutorials < publishedTutorials.size()){
//	            lastCountOfPublishedTutorials = publishedTutorials.size();
//	            User.sendEmail(subscribedUsers);
//	        }
//	        System.out.println("Polling");
	    }
			
		}
		

	}
	
	

