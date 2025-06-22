package MatricesActivities;

public class RepeatedAlphabetTriangle {
    public static void main(String[] args) {

        /*

        A
        BB
        CCC
        DDDD
        EEEEE

        * */

        for(char i = 65; i < 70; i++){
            for(char j = 65; j < i + 1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
