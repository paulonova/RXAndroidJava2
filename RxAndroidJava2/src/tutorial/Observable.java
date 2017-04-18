package tutorial;

public interface Observable {
	
	void register(Observer observer);

	 void unregister(Observer observer);

	 // New tutorial published to inform all subscribed users
	 void notifyAllAboutChange();
    
    

}
