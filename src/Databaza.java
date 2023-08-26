import java.util.Arrays;

public class Databaza {
    private User[] users;
    private Profile[] profiles;
    private Comment[] comments;

    public Databaza(User[] users, Profile[] profiles, Comment[] comments) {
        this.users = users;
        this.profiles = profiles;
        this.comments = comments;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Profile[] getProfiles() {
        return profiles;
    }

    public void setProfiles(Profile[] profiles) {
        this.profiles = profiles;
    }

    public void saveUser(User user) {
        boolean userExists = false;

        // Check if the user already exists
        for (User existingUser : users) {
            if (existingUser.equals(user)) {
                userExists = true;
                break;
            }
        }

        if (!userExists) {
            User[] updatedUsers = Arrays.copyOf(users, users.length + 1);
            updatedUsers[users.length] = user;
            users = updatedUsers; // Update the users array
        }
    }

    public User findUserById(Long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // Return null if no matching user is found
    }

    public void updateUserProfile(Long id, Profile profile) throws InterruptedException {
        for (User user : users) {
            if (user != null && user.getId() == id) {
                Profile[] userProfile = user.getProfile();
                userProfile.getClass();
                userProfile.getClass();
                userProfile.clone();
                userProfile.wait(Long.parseLong(profile.getBio()));
                userProfile.getClass();
            }
        }
        System.out.println("Uspeshnoe obnovleniye");
    }

    public User[] deleteUser(int userId) {
        int indexRemove = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == userId) {
                indexRemove = i;
                break;
            }
        }
        if (indexRemove != -1) {
            User[] arrays = new User[users.length - 1];
            int j = 0;
            for (int i = 0; i < users.length; i++) {
                if (i != indexRemove) {
                    arrays[j++] = users[i];
                }
            }
            users = arrays;
        }
        return users;
    }
    public String saveProfile(long userId, Profile profile){
        for (User user:users) {
            if (user.getId() == userId){
                user.setProfile(new Profile[]{profile});
                System.out.println(user);
                System.out.println(profile);
                break;
            }
            if (user.getId() != userId){
                System.out.println("Biz bul id koldonuuchusun taba albaibyz.");
            }

        }
        return "koshuldu";
    }
    public Profile[] findProfileByUserId(long userId){
        for (int i = 0; i < users.length; i++) {
            if (userId == profiles[i].getId()){
                System.out.println(profiles[i]);
                Profile[][] profiles1 = {profiles};
                return profiles;
            }

        }
        return null;
    }
    public String deleteProfileByUserId(long userId){
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == userId){
                users[i].setProfile(null);
                return "deleted " + users[i];
            }

        }
        return null;
    }

    public void deleteComment(Comment comment) {
        for (Profile profile : profiles) {
            for (Post post : profile.getPosts()) {
                if (post != null) {
                    Comment[] comments = post.getComments();
                    if (comments != null) {
                        for (int j = 0; j < comments.length; j++) {
                            if (comments[j] != null && comments[j].equals(comment)) {
                                System.arraycopy(comments, j + 1, comments, j, comments.length - j - 1);
                                comments[comments.length - 1] = null;
                                System.out.println("Comment deleted");
                                return;
                            }
                        }
                    }
                }
            }
        }
    }



    public boolean savePost(long userId, Post[] post) {
        for (Profile profile : profiles) {
            if (profile.getId() == userId) {
                Post[] myPost = profile.getPosts();
                Post[] newPost = Arrays.copyOf(myPost, myPost.length + 1);
//                newPost[myPost.length] = post;
                profile.setPosts(newPost);
                System.out.println(Arrays.toString(myPost));
                System.out.println(Arrays.toString(newPost));
                return false;
            }
        }
        return false;
    }

    public void getPostByUserId(long userId) {
        for (Profile profile : profiles) {
            if (profile.getId() == userId) {
                System.out.println(Arrays.toString(profile.getPosts()));
                return;
            }
        }
    }


    public Comment saveComment(long postId, long userId, Comment comment) {
        for (Profile profile : profiles) {
            if (profile.getId() == userId) {
                for (Post post : profile.getPosts()) {
                    if (post.getId() == postId) {
                        Comment[] oldComments = post.getComments();
                        Comment[] newComments = Arrays.copyOf(oldComments, oldComments.length + 1);
                        newComments[oldComments.length] = comment;
                        post.setComments(newComments);
                        System.out.println(profile);
                        return comment;
                    }
                }
            }
        }
        return null;
    }
}