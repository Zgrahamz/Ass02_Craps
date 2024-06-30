import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sca = new Scanner(System.in);

        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int crapsRoll = die1 + die2;

        String pAgain = "";

        boolean isDone = false;

        do {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            crapsRoll = die1+ die2;

            System.out.println("The dice read " + die1 + " and " + die2);
            System.out.println("The roll total is " + crapsRoll);

            if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("Got a " + crapsRoll + " and lost. " + "Craps! You lose.");
                System.out.println("Play again? [Y/N]");
                pAgain = sca.nextLine();
                if(pAgain.equalsIgnoreCase("n")) {
                    isDone = true;
                }
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("Made point and won. Natural! You win!");
                System.out.println("Play again? [Y/N]");
                pAgain = sca.nextLine();
                if(pAgain.equalsIgnoreCase("n")) {
                    isDone = true;
                }
            } else {
                System.out.println("The point! Trying for point...");
            }

        } while (!isDone);
    }
}