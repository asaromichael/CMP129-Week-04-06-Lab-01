import java.util.Scanner;

public class DriversLicenseExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] key = {"A", "D", "B", "B", "C", "B", "A", "B", "C", "D", "A", "C", "D", "B", "D", "C", "C", "A", "D", "B"};

        String[] answers = new String[20];
        int score = 0;


        for (int i = 0; i < 20; i++) {

            
            int checker = 0;
            
            
            while (checker == 0) {
                System.out.println("Enter your answer for question " + (i+1));
                answers[i] = scanner.nextLine();
                answers[i] = answers[i].toUpperCase();

                if(answers[i].equals("A") || answers[i].equals("B") || answers[i].equals("C") || answers[i].equals("D")) {

                    checker = 1;

                }
                else {
                    System.out.println("Invalid Input");

                }

            } //while loop to validate input

            
            


        } //for loop to get answers


        for (int i = 0; i < 20; i++) {

            if (answers[i].equals(key[i])) {

                score += 1;

            }


        } //for loop to check answers

        if (score >= 15) {

            System.out.println("Correct answers: " + score + " Incorrect answers: " + (20 - score) + " Result: PASS");


        }
        else {

            System.out.println("Correct answers: " + score + " Incorrect answers: " + (20 - score) + " Result: FAIL");

        }

    } //main

} //class
