package session03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bt02 {
    public static void main(String[] args) {
        List<String> listEmail = Arrays.asList("alice@gmail.com", "bob@yahoo.com", "charlie@gmail.com");
        List<String> filterEmail = listEmail.stream().filter(email -> email.contains("@gmail.com")).collect(Collectors.toList());

        filterEmail.forEach(System.out::println);
    }
}
