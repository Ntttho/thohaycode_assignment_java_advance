package session03;

import java.util.Arrays;
import java.util.List;

public class Bt01 {
    public static void main(String[] args) {
        User user1 = new User("User 1", "Email@1.com", false);
        User user2 = new User("User 2", "Email@2.com", false);
        User user3 = new User("User 3", "Email@3.com", false);

        List<User> list = Arrays.asList(user1, user2, user3);
        list.forEach(System.out::println);


    }
}

record User(String userName, String email, boolean status ){}