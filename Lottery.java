import java.util.Random;
import java.util.Scanner;

public class Lottery {
    
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] lotteryArray = {random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10)};

        int[] userArray = {0, 0, 0, 0, 0};

        for (int i = 0; i < 5; i++) {

            boolean checker = false;
            
            while (checker == false) {
                
                System.out.println("Please enter lottery number " + (i+1) + " from 0-9");
                userArray[i] = scanner.nextInt();
            
                if (userArray[i] <= 9 && userArray[i] >= 0) {

                    checker = true;

                } //end of if
                else {

                    System.out.println("Invalid number.");

                } //end of else
            
            } //end of while



        } //end of for

        int counter = 0;

        for (int i = 0; i < 5; i++) {

            if (userArray[i] == lotteryArray[i]) {

                counter += 1;

            } //end of if


        } //end of for

        if (counter < 5) {

            System.out.print("Lottery Numbers: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(lotteryArray[i]);

            }
            System.out.println("\n");

            System.out.print("Your Numbers: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(userArray[i]);

            }
            System.out.println("\n");

            System.out.println("Matching Numbers: " + counter);

        } //end of if
        else {


            System.out.print("Lottery Numbers: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(lotteryArray[i]);

            }
            System.out.println("\n");

            System.out.print("Your Numbers: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(userArray[i]);

            }
            System.out.println("\n");

            System.out.println("Matching Numbers: " + counter);
            System.out.println("Congratulations, you won the grand prize!");


        }



    } //end of main


} //end of class
