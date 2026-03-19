package session01;

import session01.Bt05.InvalidAgeException;

public class Bt03 {
    
    public static void main(String[] args) {
        User u2 = new User(100);
        User u1 = new User(140);

        System.out.println(u1.age + u2.age);
    }
}

class User {
    int age;
    String name;
    public User(int age) {
        super();
        setAge(age);
    }
    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void setAge(int age)  {
        if(age <= 0 || age >= 120){
            throw new InvalidAgeException("Argument 'age' is invalid!!!");
        }
        this.age = age;
    }

    public void displayName(){
        // phong ngua null
        if(this.name != null){
            System.out.println("Name: + " + this.name + " - Age: " + age);
        }else{
            System.out.println("Name is null !!!broooo!!!");
        }
        
    }
    
}
