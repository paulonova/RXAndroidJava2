package tutorial;

import java.util.ArrayList;
import java.util.List;

public class Tutorial  {
	
	private String authorName;
    private String post;	     
    
//    private static List<Tutorial> publishedTutorials = new ArrayList<>();
//    private static List<User> subscribedUsers = new ArrayList<>();
    private static List<Observer> observers = new ArrayList<>();
    
    public static Tutorial REGISTER_FOR_SUBSCRIPTION = new Tutorial();
    
    public Tutorial() {
	}
    
	public Tutorial(String authorName, String post) {
		this.authorName = authorName;
		this.post = post;
	}
	


	public  void publish(){
    	//notifyAllAboutChange();
    }
	
	
	
	//Getters and Setters
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
	

//	@Override
//	public void register(Observer observer) {
//		observers.add(observer);
//		
//	}
//
//	@Override
//	public void unregister(Observer observer) {
//		observers.remove(observer);
//		
//	}
//
//	@Override
//	public void notifyAllAboutChange() {
//		
//		for (Observer observer : observers) {
//            observer.notifyMe();
//        }
//		
//	}
	
	
    

}
