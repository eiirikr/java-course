import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        String[] questions = {"1. What is the main function of a router?",
                              "2. Which part of the computer is considered the brain?",
                              "3. What year was Facebook launched?",
                              "4. Who is known as the father of computers?",
                              "5. What was the first programming language?"};

        String[][] options = {{"a. Storing files", "b. Encrypting data", "c. Directing internet traffic", "d. Managing passwords"},
                              {"a. CPU", "b. Hard Drive", "c. RAM", "d. DPU"},
                              {"a. 2000", "b. 2004", "c. 2006", "d. 2008"},
                              {"a. Steve Jobs", "b. Bill Gates", "c. Alan Turing", "d. Charles Babbage"},
                              {"a. COBOL", "b. C", "c. Fortran", "d. Assembly"}};

        char[] answers = {'c', 'a', 'b', 'd', 'c'};
        int score = 0;
        char guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.next().charAt(0);

            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else{
                System.out.println("******");
                System.out.println("WRONG!");
                System.out.println("******");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();

    }
}
