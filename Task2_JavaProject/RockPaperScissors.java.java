import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String[] options = {"rock", "paper", "scissors"};

        while (true)
        {
            System.out.print("Enter rock, paper, or scissors (or 'quit' to stop): ");
            String userChoice = sc.nextLine().toLowerCase();

            if (userChoice.equals("quit"))
            {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors"))
            {
                System.out.println("Invalid choice. Try again.");
                continue;
            }
            String computerChoice = options[ran.nextInt(3)];
            System.out.println("Computer choose: " + computerChoice);
            if (userChoice.equals(computerChoice))
            {
                System.out.println("It's a tie!");
            } 
            else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) 
            {
                System.out.println("You win!");
            } 
            else 
            {
                System.out.println("You lose!");
            }

            System.out.println();
        }

        sc.close();
    }
}
