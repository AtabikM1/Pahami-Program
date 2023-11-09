public class midterm {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i--){
            if ( i % 2 == 0){
                break;
            }
            else if ( i % 3 == 0){
                continue;
            }
            else{
                System.out.println(i + "");
            }
        }  
    }
}
