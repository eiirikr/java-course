package MatricesActivities;

public class IncreasingNumberTriangle {
    public static void main(String[] args) {

        /*

        1
        12
        123
        1234
        12345

        * */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j < i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
