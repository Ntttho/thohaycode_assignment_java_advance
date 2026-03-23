package session03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bt03 {
    public static void main(String[] args) {
        UserRepository.users.add(new User("Alice", "Hello", false));
        UserRepository.users.add(new User("Bad boy", "Hello", false));
        UserRepository.users.add(new User("ALUCAMORID", "Hello", false));

        

        UserRepository userRepository = new UserRepository();
        userRepository.findUserByUserName("Alice")
                .ifPresent(user -> System.out.println("hellu: " + user.userName()));
    }
}

class UserRepository{
    static List<User> users = new ArrayList<>();
    Optional<User> findUserByUserName(String userName){
        return users.stream().filter(user -> user.userName().equals(userName)).findFirst();
    }
}
