package session02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Bt04 {
    public static void main(String[] args) {
        Supplier<User> createUserSupplier = () -> {
            int id = User.numIn++;
            return new User("Name " + id , 21, "role", "null");
        };

        List<User> list = Arrays.asList(createUserSupplier.get(), createUserSupplier.get(), createUserSupplier.get());


        for (User user : list) {
            // phuong thuc tham chieu tra ve 1 Functional Interface phai gan cho 1 Functional Interface
            Supplier<String> name = user::getName;
            System.out.println(name.get());
        }

        list.forEach(System.out::println);
        // list.stream().map(User::getName).forEach(System.out::println);

    }
}