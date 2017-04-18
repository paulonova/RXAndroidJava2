


/** * Created by Paulo Vila Nova on 2017-04-15.
 */
public class Tutorial {

    private String authorName;
    private String post;
    private Tutorial() {}

    public static rx.Observable REGISTER_FOR_SUBSCRIPTION = rx.Observable.just(new Tutorial());

    public Tutorial(String authorName, String post) {
        this.authorName = authorName;
        this.post = post;
    }

    public void publish(){
        REGISTER_FOR_SUBSCRIPTION.publish();
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
}
