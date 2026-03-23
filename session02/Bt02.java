package session02;

public class Bt02 {
    public static void main(String[] args) {
        PasswordValidator validatorNone = password -> true;
        PasswordValidator validatorLength = password -> {
            return password.length() >= 8;
        };

        User user = new User("Pass001");

        System.out.println(validatorNone.isValid(user.getPassword()));
        System.out.println(validatorLength.isValid(user.getPassword()));
    }
}

@FunctionalInterface
interface PasswordValidator {
    boolean isValid(String password);    
}