public class Average {
    public static void main(String[] args) {
        System.out.println(average(90, 95, 91));
    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;

        }
        return sum / numbers.length;
    }
}
