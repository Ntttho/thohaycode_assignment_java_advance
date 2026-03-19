package session01;

import java.util.Scanner;

public class Bt02 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Nhap vao so nguoi: ");
                int numberOfPerson = sc.nextInt();
                System.out.print("Nhap vao so nhom chia: ");
                int numberOfTeam = sc.nextInt();

                int personPerTeam = numberOfPerson / numberOfTeam;
                System.out.println("So nguoi 1 nhom la: " + personPerTeam);
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.err.println("Loi: khong the chia 1 so cho 0");
            }
        }
    }
}
