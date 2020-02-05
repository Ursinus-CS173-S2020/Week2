package week2;
/**
 * Purpose: To demonstrate the OR (||) statement
 * If someone is more than 75 years old OR
 * they feel more than 5 level sick, then
 * provide assistance to them by printing
 * "We will help you out"
 * Otherwise, print "You should be OK on your own"
 * 
 */
import java.util.Scanner;

public class Assistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter how sick you feel on a scale from 1 to 10: ");
        int sick = in.nextInt();
        
    }
}
