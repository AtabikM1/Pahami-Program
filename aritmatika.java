public class aritmatika {
    public static void main(String[] args){
        int variabel1 = 11;
        int variabel2 = 6;

        int hasil;
        //penjumlahan

        hasil = variabel1 + variabel2;
        System.out.println(variabel1 +" + "+ variabel2 + " = " +hasil);

        //pengurangan

        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);

        //perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n",variabel1,variabel2,hasil);

        //pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d /%d = %d \n",variabel1,variabel2,hasil);

        //modulus
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);

        
    }
}
