package session01;

import java.util.Scanner;

public class Bt01 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Sai dinh dang roi, chuoi nhap theo kieu so");
        } finally {
            sc.close();
        }
    }
}
