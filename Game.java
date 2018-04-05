import java.util.Scanner;
public class Game {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the celebrities:");
        System.out.println("Celebrity 1: ");
        String celeb1 = reader.nextLine();
        System.out.println("Celebrity 2: ");
        String celeb2 = reader.nextLine();
        System.out.println("Celebrity 3: ");
        String celeb3 = reader.nextLine();
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        String Newceleb1 = celeb1.substring(3,celeb1.length() - 2);
        String Newceleb2 = celeb2.substring(3,celeb2.length() - 2);
        String Newceleb3 = celeb3.substring(3,celeb3.length() - 2);
        
        System.out.println("Celebrity 1: ");
        System.out.println(Newceleb1);
        System.out.println("Celebrity 2: ");
        System.out.println(Newceleb2);
        System.out.println("Celebrity 3: ");
        System.out.println(Newceleb3);
        
        System.out.println("Guess 1: ");
        String guess1 = reader.nextLine();
        System.out.println("Guess 2: ");
        String guess2 = reader.nextLine();
        System.out.println("Guess 3: ");
        String guess3 = reader.nextLine();
        
        System.out.println("Your guess was " + guess1 + ". The answer is " + celeb1);
        System.out.println("Your guess was " + guess2 + ". The answer is " + celeb2);
        System.out.println("Your guess was " + guess3 + ". The answer is " + celeb3);
    }
}