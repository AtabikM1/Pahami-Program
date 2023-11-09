public class overload {
    public static void main (String [] args){

        int hasilinteger;
        hasilinteger = tambah(4,5,6);
        printangka(hasilinteger);

        float hasilfloat;
        hasilfloat = tambah(9.7,9.8, 8.7);
        


        
    }

    private static int tambah(int angka1, int angka2, int angka3){
        return angka1 + angka2 + angka3;
    }

    private static float tambah(float angkafloat, float angka2, float angka3){
        return angka1 + angka2 + angka3;
    }

    private static void printangka(int angkaint){
        System.out.println("angka tersebut integer dengan nilai "+ angkaint);
    }

    private static void printangka(double angkadouble){
        System.out.println("angka tersebut double dengan nilai "+ angkadouble);
    }

    private static void printangka(float angkafloat){
        System.out.println("angka tersebut float dengan nilai = " + angkafloat);
    }
}
