public class forloop {
    public static void main(String[] args){
        //for (inisialisasi; kondisi; step nilai;)
        //aksi
            
        System.out.println("start program");

        System.out.println("first loop");

        for(int a = 0 ; a <10 ; a--){
            if (a%2 == 0){
                continue;
            }else if (a%3==0){
                break;
            }else{
                System.out.println(a+ " ");
            }
            System.out.println("for loop = "+ a);
        }
        System.out.println("done");
        for(int a = 0 ; a < 16 ; ++a){
            System.out.println("for loop = "+ a);
        }
        System.out.println("done");
        for(int a = 70        ; a > 59 ; a--){
            System.out.println("for loop = "+ a);
        }
        System.out.println("done");
        System.out.println("done");
    }
}
