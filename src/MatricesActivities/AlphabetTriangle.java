package MatricesActivities;

public class AlphabetTriangle {
    public static void main(String[] args) {

        /*

        A
        AB
        ABC
        ABCD
        ABCDE

        * */

        for(char i = 65; i <= 69; i++){
            for(char j = 65; j < i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
