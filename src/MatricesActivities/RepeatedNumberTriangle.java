package MatricesActivities;

public class RepeatedNumberTriangle {
    public static void main(String[] args) {

        /*

        1
        22
        333
        4444
        55555

        * */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j < i + 1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
