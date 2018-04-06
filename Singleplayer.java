//Imports
import java.util.Scanner;
import java.util.Random;
public class Singleplayer {
    public static void main(String[] args) {
        //Create Things
        Scanner reader = new Scanner(System.in);
        Random RNG = new Random();
        //Beginning Stats for Player
        int healthMax = 100;
        int health = 100;
        int damageBase = 10;
        double damageMultiplier = 1.0;
        String special = "";
        //Other Variables
        int dungeonNumber = 1;
        int difficulty = 0;
        int points = 0;
        String dungeonDifficulty ="";
        String playAgain = "";
        int enemySelect = 0;
        //Enemy Stats
        int farLeftHealth = 0;
        int farLeftDamage = 0;
        int leftHealth = 0;
        int leftDamage = 0;
        int centerHealth = 0;
        int centerDamage = 0;
        int rightHealth = 0;
        int rightDamage = 0;
        int farRightHealth = 0;
        int farRightDamage = 0;
        //Enemy Positions
        String farLeft ="";
        String left ="";
        String center ="";
        String right ="";
        String farRight ="";
        //Game Start
        System.out.println("\n\n\nSingle Player Selected...");
        while (true) {
            System.out.println("-=Entering Dungeon "+dungeonNumber+"=-");
            difficulty = RNG.nextInt(3);
            if (difficulty==0) {//Easy Dungeon
                dungeonDifficulty = "Easy (2) Enemies";
                farLeft = "";
                farRight = "";
                center = "";
                //Left Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    leftHealth = 25;
                    leftDamage = 10;
                    left = ("[Balanced Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    leftHealth = 50;
                    leftDamage = 5;
                    left = ("[Heavy Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    leftHealth = 10;
                    leftDamage = 20;
                    left = ("[Light Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                //Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    rightHealth = 25;
                    rightDamage = 10;
                    right = ("[Balanced Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    rightHealth = 50;
                    rightDamage = 5;
                    right = ("[Heavy Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    rightHealth = 10;
                    rightDamage = 20;
                    right = ("[Light Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
            }
            if (difficulty==1) {//Normal Dungeon
                dungeonDifficulty = "Normal (3) Enemies";
                farLeft = "";
                farRight = "";
                //Left Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    leftHealth = 25;
                    leftDamage = 10;
                    left = ("[Balanced Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    leftHealth = 50;
                    leftDamage = 5;
                    left = ("[Heavy Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    leftHealth = 10;
                    leftDamage = 20;
                    left = ("[Light Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                //Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    rightHealth = 25;
                    rightDamage = 10;
                    right = ("[Balanced Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    rightHealth = 50;
                    rightDamage = 5;
                    right = ("[Heavy Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    rightHealth = 10;
                    rightDamage = 20;
                    right = ("[Light Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                //Center Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    centerHealth = 25;
                    centerDamage = 10;
                    center = ("[Balanced Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    centerHealth = 50;
                    centerDamage = 5;
                    center = ("[Heavy Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    centerHealth = 10;
                    centerDamage = 20;
                    center = ("[Light Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
            }
            if (difficulty==2) {//Difficult Dungeon
                dungeonDifficulty = "Difficult (5) Enemies";
                //Left Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    leftHealth = 25;
                    leftDamage = 10;
                    left = ("[Balanced Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    leftHealth = 50;
                    leftDamage = 5;
                    left = ("[Heavy Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    leftHealth = 10;
                    leftDamage = 20;
                    left = ("[Light Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                //Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    rightHealth = 25;
                    rightDamage = 10;
                    right = ("[Balanced Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    rightHealth = 50;
                    rightDamage = 5;
                    right = ("[Heavy Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    rightHealth = 10;
                    rightDamage = 20;
                    right = ("[Light Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                //Center Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    centerHealth = 25;
                    centerDamage = 10;
                    center = ("[Balanced Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    centerHealth = 50;
                    centerDamage = 5;
                    center = ("[Heavy Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    centerHealth = 10;
                    centerDamage = 20;
                    center = ("[Light Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                //Far Left Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    farLeftHealth = 25;
                    farLeftDamage = 10;
                    farLeft = ("[Balanced Monster HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    farLeftHealth = 50;
                    farLeftDamage = 5;
                    farLeft = ("[Heavy Monster HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    farLeftHealth = 10;
                    farLeftDamage = 5;
                    farLeft = ("[Light Monster HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                }
                //Far Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    farRightHealth = 25;
                    farRightDamage = 10;
                    farRight = ("[Balanced Monster HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    farRightHealth = 50;
                    farRightDamage = 5;
                    farRight = ("[Heavy Monster HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    farRightHealth = 10;
                    farRightDamage = 20;
                    farRight = ("[Light Monster HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                }
            }
            //Dungeon
            System.out.println("Dungeon Level: "+dungeonDifficulty);
            //Combat System
            while (true) {
                while (true) {
                    System.out.println("\n\n"+farLeft+" "+left+" "+center+" "+right+" "+farRight);
                    System.out.println("\nYour Stats: \nHP: "+health+"\nDMG: "+(int)(damageBase*damageMultiplier));
                    System.out.print("\n\n-=Your Turn=-\n(A) Attack\n(S) Special\n(I) Item\n");
                    String turn = reader.nextLine();
                    if (turn.equals("A")) { //Attack Option
                        while (true) { //Selecting which monster to attack
                            System.out.print("Which monster will you attack?\n [FL] [L] [C] [R] [FR] ");
                            String option = reader.nextLine();
                            if (option.equals("FL")) {
                                if (farLeft.equals("")) {
                                    System.out.println("There is nothing there!");
                                }
                                else {
                                    int crit = RNG.nextInt(1)+1;
                                    farLeftHealth = farLeftHealth - (int)(damageBase*damageMultiplier*crit);
                                    if (farLeftHealth<=0) {
                                        farLeft ="";
                                        points++;
                                    }
                                    break;
                                }
                            }
                            else if (option.equals("L")) {
                                if (left.equals("")) {
                                    System.out.println("There is nothing there!");
                                }
                                else {
                                    int crit = RNG.nextInt(1)+1;
                                    leftHealth = leftHealth - (int)(damageBase*damageMultiplier*crit);
                                    if (leftHealth<=0) {
                                        left ="";
                                        points++;
                                    }
                                    break;
                                }
                            }
                            else if (option.equals("C")) {
                                if (center.equals("")) {
                                    System.out.println("There is nothing there!");
                                }
                                else {
                                    int crit = RNG.nextInt(1)+1;
                                    centerHealth = centerHealth - (int)(damageBase*damageMultiplier*crit);
                                    if (centerHealth<=0) {
                                        farLeft ="";
                                        points++;
                                    }
                                    break;
                                }
                            }
                            else if (option.equals("R")) {
                                if (right.equals("")) {
                                    System.out.println("There is nothing there!");
                                }
                                else {
                                    int crit = RNG.nextInt(1)+1;
                                    rightHealth = rightHealth - (int)(damageBase*damageMultiplier*crit);
                                    if (rightHealth<=0) {
                                        right ="";
                                        points++;
                                    }
                                    break;
                                }
                            }
                            else if (option.equals("FR")) {
                                if (farRight.equals("")) {
                                    System.out.println("There is nothing there!");
                                }
                                else {
                                    int crit = RNG.nextInt(1)+1;
                                    farRightHealth = farRightHealth - (int)(damageBase*damageMultiplier*crit);
                                    if (farRightHealth<=0) {
                                        farRight ="";
                                        points++;
                                    }
                                    break;
                                }
                            }
                            else {
                                System.out.println("That is an invalid response");
                            }
                        }
                        break;
                    }
                    else if (turn.equals("S")) { //Special Option
                        break;
                    }
                    else if (turn.equals("I")) { //Item Option
                        break;
                    }
                    else { //Invalid input output
                        System.out.println("That is an invalid response");
                    }
                }
                //Monster turn
                if (farLeft.equals("")&&left.equals("")&&center.equals("")&&right.equals("")&&farRight.equals("")) {
                    System.out.println("All Monsters are dead! Dungeon "+dungeonNumber+" Cleared!");
                    break;
                }
                else {
                    System.out.println("-=Monster's Turn=-");
                    int totalDamage = farLeftDamage+leftDamage+centerDamage+rightDamage+farRightDamage;
                    health = health - totalDamage;
                    System.out.println("They did "+totalDamage+" Damage!\nYou now have "+health+" HP!");
                }
            }
            dungeonNumber++;
            //Shop Option
            while(true) {
                System.out.print("Do you want to go to the shop? (Y/N): ");
                String option = reader.nextLine();
                if (option.equals("Y")) {
                    System.out.println("\n-=Welcome to The Shop=-");
                }
                else if (option.equals("N")) {
                    System.out.println("You decided not to visit the shop");
                    break;
                }
                else {
                    System.out.println("That is an invalid input");
                }
            }
            while (true) {
                System.out.print("Advance to next Dungeon? (Y/N): ");
                playAgain = reader.nextLine();
                if (playAgain.equals("Y")||playAgain.equals("N")) {
                    break;
                }
                else {
                    System.out.println("That is an invalid input");
                }
            }
            if (playAgain.equals("N")){
                break;
            }
            if (playAgain.equals("Y")) {
                System.out.println("\n\n\n");
            }
        }
        MainMenu.main(null);
    }
}