import java.util.Scanner;

public class operatorlogika {
    public static void main(String [] args){

    //objek untuk menerima input dari user
    Scanner inputuser = new Scanner(System.in);
    
    int nilaibenar = 8;
    int nilaitebakan;
    boolean statustebakan;
    

    System.out.println("masukkan nilai tebakkan anda:");
    nilaitebakan = inputuser.nextInt();
    System.out.println("nilai tebakan anda adalah  : " + nilaitebakan);

    //operasi logika
    statustebakan = (nilaitebakan == nilaibenar);
    System.out.println("tebakan anda " + statustebakan);

    // operasi aljabar and or
    System.out.println("masukkan nilai diantara 4-9 : ");
    nilaitebakan = inputuser.nextInt();
    statustebakan = (nilaitebakan > 4) && (nilaitebakan < 9);
    System.out.println("nilai tebakan anda : " + statustebakan );
    }
}
