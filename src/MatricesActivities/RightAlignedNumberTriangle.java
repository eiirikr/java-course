package MatricesActivities;

public class RightAlignedNumberTriangle {
    public static void main(String[] args) {

        /*

            1
           12
          123
         1234
        12345

        * */

        for(int i = 1; i <= 5; i++){
            for(int j = 5; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k < i + 1; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
