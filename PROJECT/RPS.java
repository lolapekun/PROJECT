package PROJECT;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args){
        int playerChoice = getPlayerChoice();
        int computerChoice = getComputerChoice();
        String winner = setWinner(playerChoice, computerChoice);
        System.out.println(winner);
    }

    private static int getPlayerChoice(){
        System.out.println("Pick one of the three options");
        System.out.println("0: Rock \n1: Paper \n2: Scissors");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        return choice;
    }

    private static int getComputerChoice(){
        int choice = (int)(Math.random() * 2);
        return choice;
    } 

    // choice1 must be the playerChoice
    private static String setWinner(int choice1, int choice2){
        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice = choices[choice1];`    1
        String computerChoice = choices[choice2];
        String winner = "No one wins";

        System.out.println("Player chose: " + playerChoice);
        System.out.println("Computer chose: " + computerChoice);

        if (playerChoice == "Rock" && computerChoice == "Paper"){
           winner = "Computer wins";
           return winner;
        }
        if (playerChoice == "Rock" && computerChoice == "Scissors"){
            winner = "Player wins";
            return winner;
        }
        if (playerChoice == "Paper" && computerChoice == "Scissors"){
            winner = "Computer wins";
            return winner;
        }
        if (playerChoice == "Paper" && computerChoice == "Rock"){
            winner = "Player wins";
            return winner;
        }
        if (playerChoice == "Scissors" && computerChoice == "Rock"){
            winner = "Computer wins";
            return winner;
        }
        if (playerChoice == "Scissors" && computerChoice == "Paper"){
            winner = "Player wins";
            return winner;
        }

        return winner;
    }

}
