package session02;

public class Bt05 {
    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin();
        superAdmin.Log("Acgument");
    }
}

interface UserActions {
    default void logActivity(String activity) {
        System.out.println("User log activity " + activity );
    }
}

interface AdminActions {
    default void logActivit(String activity) {
        System.out.println("Admin log activity " + activity);
    }
}

class SuperAdmin implements UserActions, AdminActions{
    public void Log(String activity) {
        AdminActions.super.logActivit(activity);
    }
}