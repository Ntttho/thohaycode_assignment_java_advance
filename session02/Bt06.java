package session02;

public class Bt06 {
    public static void main(String[] args) {
        UserProcessor userProcessor = UserUtils::convertToUpperCase;

        System.out.println(userProcessor.process(new User("Nguyen van a", 20, "Admin", "1223123")));
    }
}

// functional interface
interface UserProcessor {
    String process(User u);
}

class UserUtils {
    public static String convertToUpperCase(User u){
        return u.getName().toUpperCase();
    }
}