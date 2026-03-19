package session01;

public class Bt05 {
    public static class InvalidAgeException extends RuntimeException {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        User user = new User(-1);
        System.out.println(user.age);
    }
}
