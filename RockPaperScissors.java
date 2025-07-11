import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};
        System.out.println("🎮 Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Type 'rock', 'paper', or 'scissors'. Type 'exit' to quit.\n");
        while (true) {
            System.out.print("Your move: ");
            String userMove = scanner.nextLine().toLowerCase();
            if (userMove.equals("exit")) {
                System.out.println(" Thanks for playing!");
                break;
            }
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println(" Invalid move. Please try again.");
                continue;
            }
            int computerIndex = random.nextInt(3);
            String computerMove = options[computerIndex];
            System.out.println("Computer move: " + computerMove);
            if (userMove.equals(computerMove)) {
                System.out.println(" It's a tie!\n");
            } else if (
                (userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("paper") && computerMove.equals("rock")) ||
                (userMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println(" You win!\n");
            } else {
                System.out.println(" Computer wins!\n");
            }
        }
        scanner.close();
    }
}
