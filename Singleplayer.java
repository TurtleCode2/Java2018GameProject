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
        //Items
        int healthPotion1 = 3; //Restores 25 HP
        int healthPotion2 = 2; //Restores 50 HP
        int healthPotion3 = 1; //Restores 100 HP
        //Other Variables
        int dungeonNumber = 1; //Counts Dungeon Number
        int difficulty = 0; //Determines how many monsters are in a dungeon
        int points = 0; //Currency storing variable
        String dungeonDifficulty =""; //Saves Dungeon Difficulty to output to player
        String playAgain = ""; //Stroes Play Again Answer
        int enemySelect = 0; //Stores a value for use outside loops/if/else statements
        String select =""; //Stores a value for use outside loops/if/else statements
        String option =""; //Stores a value for use outside loops/if/else statements
        String buy =""; //Stores a value for use outside loops/if/else statements
        String spec =""; //Stores a value for use ouside loops/if/else statements
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
            if (dungeonNumber%5==0) {
                difficulty = 5;
            }
            else {
                difficulty = RNG.nextInt(3);
            }
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
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    leftHealth = 50;
                    leftDamage = 5;
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    leftHealth = 10;
                    leftDamage = 20;
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                //Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    rightHealth = 25;
                    rightDamage = 10;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    rightHealth = 50;
                    rightDamage = 5;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    rightHealth = 10;
                    rightDamage = 20;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
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
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    leftHealth = 50;
                    leftDamage = 5;
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    leftHealth = 10;
                    leftDamage = 20;
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                //Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    rightHealth = 25;
                    rightDamage = 10;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    rightHealth = 50;
                    rightDamage = 5;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    rightHealth = 10;
                    rightDamage = 20;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                //Center Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    centerHealth = 25;
                    centerDamage = 10;
                    center = ("[Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    centerHealth = 50;
                    centerDamage = 5;
                    center = ("[Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    centerHealth = 10;
                    centerDamage = 20;
                    center = ("[Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
            }
            if (difficulty==2) {//Difficult Dungeon
                dungeonDifficulty = "Difficult (5) Enemies";
                //Left Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    leftHealth = 25;
                    leftDamage = 10;
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    leftHealth = 50;
                    leftDamage = 5;
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    leftHealth = 10;
                    leftDamage = 20;
                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                }
                //Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    rightHealth = 25;
                    rightDamage = 10;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    rightHealth = 50;
                    rightDamage = 5;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    rightHealth = 10;
                    rightDamage = 20;
                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                }
                //Center Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    centerHealth = 25;
                    centerDamage = 10;
                    center = ("[Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    centerHealth = 50;
                    centerDamage = 5;
                    center = ("[Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    centerHealth = 10;
                    centerDamage = 20;
                    center = ("[Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                }
                //Far Left Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    farLeftHealth = 25;
                    farLeftDamage = 10;
                    farLeft = ("[Monster HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    farLeftHealth = 50;
                    farLeftDamage = 5;
                    farLeft = ("[Monster HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    farLeftHealth = 10;
                    farLeftDamage = 5;
                    farLeft = ("[Monster HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                }
                //Far Right Enemy
                enemySelect = RNG.nextInt(3);
                if (enemySelect==0) {//Monster 1
                    farRightHealth = 25;
                    farRightDamage = 10;
                    farRight = ("[Monster HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                }
                if (enemySelect==1) {//Monster 2
                    farRightHealth = 50;
                    farRightDamage = 5;
                    farRight = ("[Monster HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                }
                if (enemySelect==2) {//Monster 3
                    farRightHealth = 10;
                    farRightDamage = 20;
                    farRight = ("[Monster HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                }
            }
            //Boss Dungeon
            if (difficulty==5) {
                dungeonDifficulty = "***BOSS***";
                centerHealth = dungeonNumber*10;
                centerDamage = 0;
                center = ("[Boss HP: "+centerHealth+" DMG: "+centerDamage+"]");
                farLeftHealth = dungeonNumber*5;
                farLeftDamage = dungeonNumber*2;
                farLeft = ("[Left Leg HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                farRightHealth = dungeonNumber*5;
                farRightDamage = dungeonNumber*2;
                farRight = ("[Right Leg HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                leftHealth = dungeonNumber*2;
                leftDamage = dungeonNumber*5;
                left = ("[Left Arm HP: "+leftHealth+" DMG: "+leftDamage+"]");
                rightHealth = dungeonNumber*2;
                rightDamage = dungeonNumber*5;
                right = ("[Right Arm HP: "+rightHealth+" DMG: "+rightDamage+"]");
            }
            //Dungeon
            System.out.println("Dungeon Level: "+dungeonDifficulty);
            //Combat System
            while (true) {
                while (true) {
                    System.out.println("\n"+farLeft+" "+left+" "+center+" "+right+" "+farRight);
                    System.out.println("\nYour Stats: \nHP: "+health+"\nDMG: "+(int)(damageBase*damageMultiplier));
                    System.out.print("\n-=Your Turn=-\n(A) Attack\n(I) Item\n");
                    String turn = reader.nextLine();
                    if (turn.equals("A")) { //Attack Option
                        while (true) { //Selecting which monster to attack
                            System.out.print("Which monster will you attack?\n [FL] [L] [C] [R] [FR] \n (B) To Cancel");
                            option = reader.nextLine();
                            if (option.equals("FL")) {
                                if (farLeft.equals("")) {
                                    System.out.println("There is nothing there!");
                                }
                                else {
                                    int crit = RNG.nextInt(2)+1;
                                    farLeftHealth = farLeftHealth - (int)(damageBase*damageMultiplier*crit);
                                    System.out.println("You did "+(int)(damageBase*damageMultiplier*crit)+" damage");
                                    farLeft = ("[Monster HP: "+farLeftHealth+" DMG: "+farLeftDamage+"]");
                                    if (farLeftHealth<=0) {
                                        farLeft ="";
                                        farLeftHealth = 0;
                                        farLeftDamage = 0;
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
                                    int crit = RNG.nextInt(2)+1;
                                    leftHealth = leftHealth - (int)(damageBase*damageMultiplier*crit);
                                    System.out.println("You did "+(int)(damageBase*damageMultiplier*crit)+" damage");
                                    left = ("[Monster HP: "+leftHealth+" DMG: "+leftDamage+"]");
                                    if (leftHealth<=0) {
                                        left ="";
                                        leftHealth = 0;
                                        leftDamage = 0;
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
                                    int crit = RNG.nextInt(2)+1;
                                    centerHealth = centerHealth - (int)(damageBase*damageMultiplier*crit);
                                    System.out.println("You did "+(int)(damageBase*damageMultiplier*crit)+" damage");
                                    center = ("[Monster HP: "+centerHealth+" DMG: "+centerDamage+"]");
                                    if (centerHealth<=0) {
                                        center ="";
                                        centerHealth = 0;
                                        centerDamage = 0;
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
                                    int crit = RNG.nextInt(2)+1;
                                    rightHealth = rightHealth - (int)(damageBase*damageMultiplier*crit);
                                    System.out.println("You did "+(int)(damageBase*damageMultiplier*crit)+" damage");
                                    right = ("[Monster HP: "+rightHealth+" DMG: "+rightDamage+"]");
                                    if (rightHealth<=0) {
                                        right ="";
                                        rightHealth = 0;
                                        rightDamage = 0;
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
                                    int crit = RNG.nextInt(2)+1;
                                    farRightHealth = farRightHealth - (int)(damageBase*damageMultiplier*crit);
                                    System.out.println("You did "+(int)(damageBase*damageMultiplier*crit)+" damage");
                                    farRight = ("[Monster HP: "+farRightHealth+" DMG: "+farRightDamage+"]");
                                    if (farRightHealth<=0) {
                                        farRight ="";
                                        farRightHealth = 0;
                                        farRightDamage = 0;
                                        points++;
                                    }
                                    break;
                                }
                            }
                            else if (option.equals("B")) {
                                break;
                            }
                            else {
                                System.out.println("That is an invalid response");
                            }
                        }
                        if (option.equals("FL")||option.equals("L")||option.equals("C")||option.equals("R")||option.equals("FR")) {
                            break;
                        }
                    }
                    else if (turn.equals("I")) { //Item Option
                        while (true) {
                            System.out.println("\n-=Items=-\n(HP1) Health Potion Level 1 x"+healthPotion1+"\n(HP2) Health Potion Level 2 x"+healthPotion2+"\n(HP3) Health Potion Level 3 x"+healthPotion3+"\n(B) Back");
                            System.out.print("Select: ");
                            select = reader.nextLine();
                            if (select.equals("HP1")) {
                                if (healthPotion1==0) {
                                    System.out.println("You don't have any!");
                                }
                                else {
                                    System.out.println("You used a health potion!");
                                    health = health + 25;
                                    healthPotion1 --;
                                    break;
                                }
                            }
                            else if (select.equals("HP2")) {
                                if (healthPotion2==0) {
                                    System.out.println("You don't have any!");
                                }
                                else {
                                    System.out.println("You used a health potion!");
                                    health = health + 50;
                                    healthPotion2 --;
                                    break;
                                }
                            }
                            else if (select.equals("HP3")) {
                                if (healthPotion3==0) {
                                    System.out.println("You don't have any!");
                                }
                                else {
                                    System.out.println("You used a health potion!");
                                    health = health + 100;
                                    healthPotion3 --;
                                    break;
                                }
                            }
                            else if (select.equals("B")) {
                                break;
                            }
                            else {
                                System.out.println("That is an invalid response");
                            }
                        }
                        if (select.equals("HP1")||select.equals("HP2")||select.equals("HP3")) {
                            break;
                        }
                    }
                    else { //Invalid input output
                        System.out.println("That is an invalid response");
                    }
                }
                //Monster turn
                if (farLeft.equals("")&&left.equals("")&&center.equals("")&&right.equals("")&&farRight.equals("")) {
                    System.out.println("\nAll Monsters are dead! Dungeon "+dungeonNumber+" Cleared!");
                    break;
                }
                else {
                    System.out.println("\n-=Monster's Turn=-");
                    int totalDamage = farLeftDamage+leftDamage+centerDamage+rightDamage+farRightDamage;
                    health = health - totalDamage;
                    System.out.println("They did "+totalDamage+" Damage!\nYou now have "+health+" HP!");
                    if (health<=0) {
                        System.out.println("\nYou are out of HP!\n-=GAME OVER!=-\nDungeon Reached: Dungeon "+(dungeonNumber));
                        break;
                    }
                }
            }
            if (health<=0) {
                break;
             }
            dungeonNumber++;
            //Shop Option
            while(true) {
                System.out.print("Do you want to go to the shop? (Y/N): ");
                option = reader.nextLine();
                if (option.equals("Y")) {
                    System.out.println("\n-=Welcome to The Shop=-");
                    while (true) {
                        System.out.print("\n(FH) Full Heal: 1 Coin\n(MXH) Max Health Increase: 3 Coins\n(MXD) Base Damage Increase: 3 Coins\n(DXI) Damage Multiplier Increase: 3 Coins\n(HP1) Health Potion Level 1: 2 Coins\n(HP2) Health Potion Level 2: 4 Coins\n(HP3) Health Potion Level 3: 6 Coins\n(E) Exit Shop\nYou have "+points+" coins: ");
                        buy = reader.nextLine();
                        if (buy.equals("HP1")) {
                            if (points>=2) {
                                System.out.println("You bought a Health Potion Lavel 1");
                                healthPotion1++;
                                points = points -2;
                            }
                            else {
                                System.out.println("You don't have enought money");
                            }
                        }
                        else if (buy.equals("HP2")) {
                            if (points>=4) {
                                System.out.println("You bought a Health Potion Lavel 2");
                                healthPotion2++;
                                points = points -4;
                            }
                            else {
                                System.out.println("You don't have enought money");
                            }
                        }
                        else if (buy.equals("HP3")) {
                            if (points>=6) {
                                System.out.println("You bought a Health Potion Lavel 3");
                                healthPotion3++;
                                points = points -6;
                            }
                            else {
                                System.out.println("You don't have enought money");
                            }
                        }
                        else if (buy.equals("FH")) {
                            if (points>=1) {
                                System.out.println("You bought a Full Heal");
                                health = healthMax;
                                points = points -1;
                            }
                            else {
                                System.out.println("You don't have enought money");
                            }
                        }
                        else if (buy.equals("MXH")) {
                            if (points>=3) {
                                System.out.println("Your Maximum Health has been increased by 25");
                                healthMax = healthMax + 25;
                                points = points -3;
                            }
                            else {
                                System.out.println("You don't have enought money");
                            }
                        }
                        else if (buy.equals("MXD")) {
                            if (points>=3) {
                                System.out.println("Your base damage increased by 5");
                                damageBase = damageBase +5;
                                points = points -3;
                            }
                            else {
                                System.out.println("You don't have enought money");
                            }
                        }
                        else if (buy.equals("DXI")) {
                            if (points>=3) {
                                System.out.println("Your damage multiplier increased by 0.1");
                                damageMultiplier = damageMultiplier + 0.1;
                                points = points -3;
                            }
                            else {
                                System.out.println("You don't have enought money");
                            }
                        }
                        else if (buy.equals("E")) {
                            System.out.println("You decided to exit the shop");
                            break;
                        }
                        else {
                            System.out.println("That is an invalid response");
                        }
                    }
                    break;
                }
                else if (option.equals("N")) {
                    System.out.println("\nYou decided not to visit the shop");
                    break;
                }
                else {
                    System.out.println("That is an invalid input");
                }
            }
            while (true) {
                System.out.print("\nAdvance to next Dungeon? (Y/N): ");
                playAgain = reader.nextLine();
                if (playAgain.equals("Y")||playAgain.equals("N")) {
                    break;
                }
                else {
                    System.out.println("That is an invalid input");
                }
            }
            if (playAgain.equals("N")){
                System.out.println("\n-=GAME OVER!=-\nDungeon Reached: Dungeon "+(dungeonNumber-1));
                break;
            }
            if (playAgain.equals("Y")) {
                System.out.println("\n\n\n");
            }
        }
        MainMenu.main(null);
    }
}