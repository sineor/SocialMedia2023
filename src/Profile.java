import java.time.LocalDate;
import java.util.Arrays;

public class Profile {
    private static int nextId = 1;
    private int id;
    private String full_name;
    private LocalDate dateOfBirth;
    private String gender;
    private String bio;
    private Post [] posts;
    private Profile [] profiles;
////

    public Profile(String full_name, LocalDate date_of_birth, String gender, String bio, Post[] posts) {
        this.id = nextId++;
        this.full_name = full_name;
        this.dateOfBirth = date_of_birth;
        this.gender = gender;
        this.bio = bio;
        this.posts = posts;
    }
    public Profile(){

    }


    public static void setNextId(int nextId) {
        Profile.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public LocalDate getDate_of_birth() {
        return dateOfBirth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.dateOfBirth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }


    @Override
    public String toString() {
        return "Profile{" +
                ", full_name='" + full_name + '\'' +
                ", date_of_birth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", bio='" + bio + '\'' +
                ", posts=" + Arrays.toString(posts) +
                ", profiles=" + Arrays.toString(profiles) +
                '}';
    }
}