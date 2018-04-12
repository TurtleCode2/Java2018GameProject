//Imports
import java.util.Scanner;
import java.util.Random;
public class MainMenu {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("\n-=Welcome to Dungeon Knight=-");
        while(true){//this loop makes sure the response to the question is a valid response and  continues the game if the player(s) would like to play again
            System.out.println("\n(S) Singleplayer\n(M) Multiplayer\n(GS) Singleplayer Guide\n(GM) Multiplayer Guide\n(A) About\n(E) Exit");
            String input = reader.nextLine();
            if(input.equals("S")) {
                Singleplayer.main(null); //Links to Single Player Game
                break;
            }
            else if(input.equals("M")) {
                //Multiplayer.main(null); //Links to Mulitplayer Game
                break;
            }
            else if(input.equals("GS")) { //Instructions for Singleplayer
                System.out.println("\n-=Singleplayer Guide=-");
                System.out.println("Objective: Clear the Dungeon to move on to the next one");
                System.out.println("How to Play: Just input the option that you want when the game asks");
                System.out.println("In Game Mechanics:\n - There is a 50% chance to double damage with a critical hit\n - Each enemy killed will give you points to spend at the shop \n - The shop will be available after completing each dungeon\n - Many useful items and upgrades will be available in the shop\n - Every 5 Dungeons is a Boss Dungeon\n - Killing the center of a boss will end the encounter with all parts destroyed");
            }
            else if(input.equals("GM")) { //Instructions for Multiplayer
                System.out.println("\n-=Multiplayer Guide=-");
                System.out.println("Objective: Clear the Dungeon to move on to the next one");
                System.out.println("How to Play: Just input the option that you want when the game asks");
                System.out.println("In Game Mechanics:\n - Each enemy killed will give you points to spend at the shop \n - The shop will be available after completing each dungeon\n - Many useful items and upgrades will be available in the shop");
            }
            else if(input.equals("A")) { //About
                System.out.println("\n-=About=-\nDungeon Knight v1.0\nCreated by Justin and Eddie");
            }
            else if(input.equals("E")) { //Exit Statement
                break;
            }
            else {//if the response is not valid, the loop will continue.
                System.out.println("That was not a valid response.");
            }
        }
    }
}
