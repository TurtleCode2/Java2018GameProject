//Imports
import java.util.Scanner;
import java.util.Random;
public class MainMenu {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Dungeon Knight!");
        while(true){//this loop continues the game if the player(s) would like to play again
            while(true){//this loop makes sure the response to the question is a valid response
                System.out.println("Would you like to play singleplayer or multiplayer?");
                System.out.println("(S) for singlneplayer and (M) for multiplayer.");
                String gameType = reader.nextLine();
                
                if(gameType .equals("S")){
                    //play singleplayer here
                    //System.out.println("Singleplayer");
                    break;
                }else if(gameType .equals("M")){
                    //play multiplayer here
                    //System.out.println("Multiplayer");
                    break;
                }
                //if the response is not valid, the loop will continue.
                System.out.println("That was not a valid response.");
            }
            System.out.println("Would you like to play again?");
            System.out.println("(N) for no and anything else for yes.");
            String playAgain = reader.nextLine();
            if(playAgain .equals("N")){
                break;
            }
        }
    }
}
