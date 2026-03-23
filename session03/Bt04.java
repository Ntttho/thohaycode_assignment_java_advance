package session03;

import java.util.List;
import java.util.stream.Collectors;

public class Bt04 {
    public static void main(String[] args) {
        List<User> listUser = List.of(
                new User("Alice", "123", true),
                new User("Bad boy", "456", false),
                new User("Alice", "789", true), // Trùng username với Alice đầu tiên
                new User("ALUCAMORID", "000", true));

        List<User> listUserTomap = listUser.stream().collect(Collectors.toMap(User::userName, user -> user, (existing, replacement) -> existing))
                                            .values()
                                            .stream()
                                            .toList();
        listUserTomap.forEach(System.out::println);
    }
}
