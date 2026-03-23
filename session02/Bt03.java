package session02;

public class Bt03 {
    public static void main(String[] args) {
        Authenticatable authenticatable = Authenticatable::encrypt;

        String pass = "";
        System.out.println(authenticatable.getPassword(pass));
        System.out.println(authenticatable.isAuthenticated(pass));

    }
}

interface Authenticatable {
    String getPassword(String pass);

    default boolean isAuthenticated(String pass){
        return pass != null && !pass.isEmpty();
    } // chi goi qua instance

    static String encrypt(String rawPassword) {
        if (rawPassword == null) {
            return "";
        }
        return "_" + rawPassword + "_";
    }

    
}