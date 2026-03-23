package session02;

import java.util.function.Predicate;

public class Bt01 {
    public static void main(String[] args) {
        Predicate<User> checkAdminRole = t -> t.getRole().equals("Admin");
        User user1 = new User("Tho", 20, "Admin");

        System.out.println("Check user_ "+ user1.getName() + " is admin: " + checkAdminRole.test(user1));
    }
}

class User{

    static int numIn = 0;

    private String name;
    private int age;
    private String role;
    private String password;
    
    public User(String name, int age, String role) {
        super();
        this.name = name;
        this.age = age;
        this.role = role;
    }
    public User (String pass){
        this.password = pass;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRole() {
        return role;
    }
    public String getPassword() {
        return password;
    }
    public User(String name, int age, String role, String password) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", role=" + role + ", password=" + password + "]";
    }
    
    
}