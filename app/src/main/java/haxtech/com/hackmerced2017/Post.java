package haxtech.com.hackmerced2017;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Post {

    public String userID;
    public String body;
    public double avgRating;
    public String vidUrl;

    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Post(String userID, String body, String vidUrl) {
        this.userID = userID;
        this.body = body;
        this.vidUrl = vidUrl;
        this.avgRating = 0.0;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("userID", userID);
        result.put("body", body);
        result.put("avgRating", avgRating);
        result.put("vidUrl", vidUrl);
        return result;
    }

}