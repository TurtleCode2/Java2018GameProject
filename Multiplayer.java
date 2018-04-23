//imports
import java.util.Scanner;
import java.util.Random;
public class Multiplayer {
    public static void main(String[] args){
        //creating scanners and RNGs
        Scanner reader = new Scanner(System.in);
        Random RNG = new Random();
        
        //variable initializing
        int dungeonLevel = 1;//keeps track of the dungeon nuber(1-10)
        int playerTurn = 1;//keeps track of whose turn it is
        //int monsterTurn = 0;//keeps track of which monster's turn it is
        int monsterNum = 0;//numer of monsters total in this dungeon
        int monstersLeft = 0;//living mionsters left
        int playerNum;//number of players
        int playersLeft;//living players left
        int attackMonster;//which monster is being attacked
        int attackPlayer;//which player is being attacked
        //These keep track of all monster and player statistics
        int[] playerHp;
        int[] playerAttk;
        int[] monsterHp;
        int[] monsterAttk;
        
        
        System.out.println("\n\n\nWelcome to multiplayer!");
        
        while(true){//This loop is asing how many players there will be in the game
            System.out.println("How many players are there?");
            playerNum = reader.nextInt();
            //this loop makes sure that there is a valid amound of players(2 - 4)
            if(playerNum >= 2 && playerNum <= 4){
                //if there is a valid amound, the question loop is broken.
                break;
            }
            //if not, it tells the user and then repeats
            System.out.println("That is not a valid amount of players.");
            System.out.println("There can only be 2 - 4 players.");
        }
        playersLeft = playerNum;
        playerHp = new int [playerNum];
        for(int i = 0; i < playerNum; i ++){//initialize all player's health to 100
            playerHp[i] = 100;
        }
        
        playerAttk = new int [playerNum];
        for(int i = 0; i < playerNum; i ++){//initialize all player's attack to 20
            playerAttk[i] = 15;
        }
        
        while(dungeonLevel <= 10){//this is the dungeon loop. It repeats every new dungeon.
            if(playersLeft == 0){
                break;
            }
            System.out.println("You are now entering dungeon " + dungeonLevel + ".");
            
            monsterNum = 0;
            for(int i = playerNum; i >= 1; i --){//set number of monsters for this level
                monsterNum += RNG.nextInt(dungeonLevel);
            }
            monsterNum = (monsterNum / 4) + (dungeonLevel);//lower the amount of monsters
            if(monsterNum <= playerNum){//make sure there are enough monsters
                monsterNum += playerNum;
            }
            monstersLeft = monsterNum;
            monsterHp = new int [monsterNum];
            monsterAttk = new int [monsterNum];
            
            
            for(int i = 0; i < monsterNum; i ++ ){//This is in charge of initializing all the types of monsters.
                int monsterType = RNG.nextInt(6);
                if(monsterType == 0 || monsterType == 1){
                    monsterAttk[i] = 10;
                    monsterHp[i] = 75;
                }
                if(monsterType == 2 || monsterType == 3){
                    monsterAttk[i] = 15;
                    monsterHp[i] = 50;
                }
                if(monsterType == 4 || monsterType == 5){
                    monsterAttk[i] = 20;
                    monsterHp[i] = 25;
                }
                if(monsterType == 6){
                    monsterAttk[i] = 15;
                    monsterHp[i] = 75;
                }
            }
            
            
            while(true){//this is the 'turn' loop. It repeats every new turn.
                if(monstersLeft == 0){
                    break;
                }
                if(monstersLeft == 0){
                    break;
                }
                System.out.println("\nIt is player " + playerTurn + "'s turn.");
                System.out.println("There are " + monstersLeft + " monsters left.");
                if(playerHp[playerTurn - 1] <= 0){
                    System.out.println("Player " + playerTurn + " is dead.");
                    playerTurn ++;
                }else{
                    
                    while(true){//This loop is to ask which monster to attack
                        System.out.println("Which monster would you like to attack? In integer an integer please.");
                        System.out.println("Between 1 and " + monsterNum + ".");
                        attackMonster = reader.nextInt() - 1;
                        if(attackMonster + 1 > monsterNum || attackMonster <= -1){
                            
                            System.out.println("That monster does not exist.");
                            continue;
                        }else if(monsterHp[attackMonster] <= 0){
                            
                            System.out.println("That monster is dead.");
                            continue;
                        }else{
                            break;//this statement will only be reached if the monster is in range and alive.
                        }
                    }
                    int attkChance = RNG.nextInt(9);
                    if(attkChance <= 1){
                        System.out.println("You missed.");
                    }else{
                        System.out.println("You hit!");
                        monsterHp[attackMonster] -= playerAttk[playerTurn - 1];
                        System.out.println("Monster " + (attackMonster + 1) + " is at " + monsterHp[attackMonster] + "hp.");
                    }
                    if(monsterHp[attackMonster] <= 0){
                        monstersLeft -= 1;
                        System.out.println("You killed a monster!");
                    }
                    
                    
                    
                    if(monsterNum <= 0){
                        break;
                    }
                    playerTurn ++;
                    if(playerTurn > playerNum){//now it is the monster's turn
                        playerTurn = 1;
                        if(monstersLeft == 0){
                                break;
                            }
                        System.out.println("\nIt is the monster's turn!");
                        for(int monsterTurn = 0; monsterTurn < monsterNum; monsterTurn ++){
                            while(true){
                                attackPlayer = RNG.nextInt(playerNum);
                                if(playerHp[attackPlayer] > 0){
                                    break;
                                }
                            }
                            if(monsterHp[monsterTurn] <= 0){
                                System.out.println("Monster " + (monsterTurn + 1) + " is dead.");
                            }else{
                                
                                
                                attkChance = RNG.nextInt(9);
                                if(attkChance <= 2){
                                    System.out.println("\nThe monster missed.");
                                }else{
                                    System.out.println("\nThe monster hit!");
                                    playerHp[attackPlayer] -= monsterAttk[monsterTurn];
                                    System.out.println("Player " + (attackPlayer + 1) + " is at " + playerHp[attackPlayer] + "hp.");
                                }
                                if(playerHp[attackPlayer] <= 0){
                                    playersLeft -= 1;
                                    System.out.println("Player " + (attackPlayer + 1) + " is dead.");
                                }
                                if(monstersLeft == 0){
                                    break;
                                }
                            }
                        }
                    }
                }
                if(playersLeft == 0){

                    break;
                }
            }
            dungeonLevel ++;
        }   
        System.out.println("You Lost");
        MainMenu.main(null);
    }
}
