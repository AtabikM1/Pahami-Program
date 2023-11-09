public class belahketupat {
    
    public static void main(String[] args) {
        int n = 5; // ukuran belah ketupat, Anda dapat mengubah nilai ini sesuai kebutuhan

        // Bagian atas belah ketupat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bagian bawah belah ketupat
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 0; k < n - i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
            
        // }
        // int rows = 8; // Jumlah baris

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i = rows - 1; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        

        
    }
}