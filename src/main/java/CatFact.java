public class CatFact {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    CatFact(String id, String text, String type, String user, Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.upvotes = upvotes;
    }

    CatFact() {
    }

    @Override
    public String toString() {
        return "|id:" + id + "|fact:" + text + "|type:" + type + "|user:" + user + "|upvotes:" + upvotes + "|";
    }
}
