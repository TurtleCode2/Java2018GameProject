//Imports
import java.util.Scanner;
import java.util.Random;
public class MainMenu {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("-=Welcome to Dungeon Knight!=-");
        while(true){//this loop makes sure the response to the question is a valid response and  continues the game if the player(s) would like to play again
            System.out.println("\n(S) Singleplayer\n(M) Multiplayer\n(I) Instructions\n(A) About\n(E) Exit");
            String input = reader.nextLine();
            if(input.equals("S")) {
                Singleplayer.main(null); //Links to Single Player Game
                break;
            }
            else if(input.equals("M")) {
                //Multiplayer.main(null); //Links to Mulitplayer Game
                break;
            }
            else if(input.equals("I")) { //Instructions
                System.out.println("\n-=Instruction=-\nObjective: Clear the Dungeon to move on to the next one\nHow to Play: Just input the option that you want when the game asks\nIn Game Mechanics:\n - Each enemy killed will give you points to spend at the shop \n - The shop will be available after completing each dungeon\n - Many useful items and perks will be available in the shop");
            }
            else if(input.equals("A")) { //About
                System.out.println("\n-=About=-\nDungeon Knight v1.0\nCreated by Justin and Eddie");
            }
            else if(input.equals("E")) {
                break;
            }
            else {//if the response is not valid, the loop will continue.
                System.out.println("That was not a valid response.");
            }
        }
    }
}
