package session01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bt06 {
    
    public static class InvalidUserException extends RuntimeException {
        public InvalidUserException(String message){
            super(message);
        }
    }

    public static class Logger {
        public static void logError(String message){
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss"));
            System.err.println("Error " + timestamp + " - " + message);
        }
    }

    public static void main(String[] args) {
        try {
            User s = new User("",-1);
        } catch (IllegalArgumentException e) {
            Logger.logError("Loi du lieu dau vao: " + e.getMessage());
        } catch (Exception e){
            Logger.logError("Loi khong xac dinh: " + e.getMessage());
        }
    }
}
