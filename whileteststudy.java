import java.util.Scanner;

public class whileteststudy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nama, gender;
        int jumlahmhs = 0;
        
        

        do {
            System.out.print("masukkan nama mahasiswa = ");
            nama = sc.next();
            System.out.println("masukkan gender = (f/m)");
            gender = sc.next();
            if (gender.equalsIgnoreCase("f")){
                System.out.println(nama + " bergender perempuan");
                ++jumlahmhs;
            }
            

        }while (++jumlahmhs <= 30);
    }   
}
