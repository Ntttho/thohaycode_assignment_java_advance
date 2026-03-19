package session01;

import java.io.IOException;
import java.util.Scanner;

public class Bt04 {
    
    private static final Scanner sc = new Scanner(System.in);

    public static void saveToFile(String pathFile) throws IOException{
        System.out.println("Dang ghi file: " + pathFile);
        
        boolean checkDiskFull = true; // dang day
        
        if(checkDiskFull){
            throw new IOException("Loi: Oi doi oi o cung bi day roi khong ghi duoc file");
        }

        System.out.println("Ghi file thanh cong");
    }

    public static void processUserData() throws IOException{
        // cũng triển khai IOExeption để đuồn trách nhiệm lên cấp cao hơn
        String pathFile = sc.nextLine();
        if(pathFile == null || pathFile.isEmpty()){
            throw new IOException("Loi ten file khong duoc de trong");
        }else{
            saveToFile(pathFile);
        }
    }

    public static void main(String[] args) {
        try {
            processUserData();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Loi roi: PathFile khong co ton tai");
        }
    }

}


