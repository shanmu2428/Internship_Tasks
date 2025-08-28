import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?/";

        String characterPool = "";

        System.out.print("\nEnter desired password length: ");
        int length = sc.nextInt();
        sc.nextLine();  

        System.out.print("Include uppercase letters? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y")) 
        {
            characterPool += upperCase;
        }

        System.out.print("Include lowercase letters? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y"))
        {
            characterPool += lowerCase;
        }

        System.out.print("Include numbers? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y"))
        {
            characterPool += numbers;
        }

        System.out.print("Include special characters? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y"))
        {
            characterPool += specialChars;
        }

        if (characterPool.isEmpty())
        {
            System.out.println("Error: You must select at least one character type!");
            sc.close();
            return;
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) 
        {
            int index = ran.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }
            System.out.println("\nGenerated Password: " + password.toString());

        sc.close();
    }
}
