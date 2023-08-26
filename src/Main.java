// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.Callable;


public class Main {
    public static void main(String[] args) {
        Comment comment = new Comment("Krasavhcik!",LocalDate.of(2023,1,17));
        Comment comment1 = new Comment("dfghj",LocalDate.of(2023,6,13));
        Comment[] comments ={comment,comment1};

        Comment comment2 = new Comment("Bizge da juksun.",LocalDate.of(2023,5,1));
        Comment comment3 = new Comment("vau!",LocalDate.of(2023,2,19));
        Comment[] comments1 ={comment2,comment3};

        Comment comment4 = new Comment("mashallah!",LocalDate.of(2023,5,1));
        Comment comment5 = new Comment("Molodes1",LocalDate.of(2023,2,28));
        Comment [] comments2 = {comment4,comment5};

        Post posts = new Post("Mekka","Assalamu aleikum! ",4,comments);
        Post post1 = new Post("Maldivy","vsem privet",2,comments);
        Post [] posts1 = {posts,post1};

        Post post2 = new Post("Kyrgyzstan","kehcki Bishkek",7,comments1);
        Post post3 = new Post("Dubai","Assalamu aleikum! welcome to Dubai",3,comments1);
        Post[] posts2 = {post2,post3};

        Post post4 = new Post("Turkey","Stambul",3,comments2);
        Post post5 = new Post("Dubai","mechet ot im sheih zait",3,comments2);
        Post [] posts3 = {post4,post5};



        Profile profile = new Profile("Nurs", LocalDate.of(2020,8,29),"M","bilal",posts1);
        Profile profile1 = new Profile("JAndar", LocalDate.of(2002,4,13),"M","bilal",posts2);
        Profile profile2 = new Profile("Erik", LocalDate.of(2019,5,24),"M","bilal",posts3);
        Profile [] profiles = {profile,profile1,profile2};

        User user1 = new User("Nurles","@nurgmail.com","12345545435",profile);
        User user2 = new User("Jandar","@jandar01@gmail.com","12345545435",profile1);
        User user3 = new User("Erkin","@erkin@gmail.com","12345545435",profile2);
        User [] users = {user1, user2, user3};


     Databaza databaza = new Databaza(users,profiles,comments) ;
     Databaza databaza1 = new Databaza(users, profiles, comments);

       System.out.println(databaza.findUserById(2l));

       databaza.findUserById(3L);
        databaza.setProfiles(new Profile[]{profile});

        System.out.println(Arrays.toString(databaza.deleteUser(3)));

       databaza.saveProfile(1L,profile1);
       databaza.findUserById(3L);

       System.out.println(databaza.deleteUser(1));



        System.out.println(databaza.savePost(3, new Post[]{post1}));
        databaza.getPostByUserId(1L);
        System.out.println(databaza1.saveComment(1L,2L,comment2));
        Profile profilea = new Profile();
        databaza.deleteComment(comment2);
        post1.updateComment(1L,"class");
        System.out.println(Arrays.toString(new long[]{(1L)}));
    }
}