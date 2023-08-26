import java.util.Arrays;

public class Post {
    private static int uniqueID=1;
    private int id;
    private String image;
    private String description;
    private int created;
    private Comment []comments;

    public Post(String image, String description, int created, Comment[] comments) {
        this.id = uniqueID++;
        this.image = image;
        this.description = description;
        this.created = created;
        this.comments = comments;
    }

    public static int getUniqueID() {
        return uniqueID;
    }

    public static void setUniqueID(int uniqueID) {
        Post.uniqueID = uniqueID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }

    public void updateComment(long l, String aClass) {
    }
}