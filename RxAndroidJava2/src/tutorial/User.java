package tutorial;

import java.util.ArrayList;
import java.util.List;


public class User implements Action  {
	
	 	private String name;
	    private String email;
	    
	    
	    
	    
	    public User(){
	    	
	    }	    
	    
	    public User(String name, String email) {
			this.name = name;
			this.email = email;
		}
	    
	    
	    
//	    @Override
//		public void notifyMe() {
//			//sendEmail(this);
//			
//		}

		public static void sendEmail(List<User> userList){
	        for (User user : userList) {
	                System.out.println("Email send: " + user.getName());
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

		

}
