import java.util.Scanner;
import java.util.Random;

import static java.lang.System.*;

public class Game {

        public static void main(String[] args) {
            out.print("Enter your name: ");
            Scanner sc= new Scanner(in);
            sc.nextLine();
            out.println("Choose your number");
            out.println("1.  stand as for rock\n2.  stands for paper\n3.  stands for siccsor");
            Random rand = new Random();
            int YOU = 0;
            int computer = 0;
            for (int i = 0; i < 5; i++) {
                int upperbound = 3;
                int comp = rand.nextInt(upperbound);
                out.println("Select one number among 1, 2, 3");
                int human = sc.nextInt();
                out.println("computer selected: " + comp);
                if (comp == 0 && human == 1) {
                    out.println(" You won");
                    YOU++;
                } else if (comp == 0 && human == 2) {
                    out.println(" You lose");
                    computer++;
                } else if (comp == 1 && human == 0) {
                    out.println(" You lose");
                    computer++;
                } else if (comp == 1 && human == 2) {
                    out.println(" You won");
                    YOU++;
                } else if (comp == 2 && human == 0) {
                    out.println(" You won");
                    YOU++;
                } else if (comp == 2 && human == 1) {
                    out.println(" You lose");
                    computer++;
                } else if (comp == human) {
                    computer = computer + 1;
                    out.println("It's a tie, both computer and you selected the same...");
                }
            }
            out.println("The final score of computer is: " + computer + " and you scored : " + YOU);
            if (computer > YOU) {
                out.println("Sorry, finally computer won!!. Better luck next time ");

            } else {
                out.println("Congratulations finally you won!!!");
            }
        }

    }
