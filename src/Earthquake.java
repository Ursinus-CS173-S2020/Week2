/**
 * Purpose: To practice if/else statements
 * by printing out different scenarios given
 * the magnitude of an earthquake on the
 * Richter Scale
 */
import java.util.Scanner;

public class Earthquake {
    public static void main(String[] args) {
        System.out.print("What's the magnitude of the earthquake? ");
        // TODO: Create input with proper type
        // TODO: Create a series of if/else statements
        // that convert a Richter Scale range to
        // an outcome
        Scanner in = new Scanner(System.in);
        double magnitude = in.nextDouble();
        if (magnitude >= 8.0) {
            System.out.println("Most buildings fall");
        }
        else if(magnitude >= 7.0) {
            System.out.println("Many buildings fall");
        }
        else if(magnitude >= 6.0) {
            System.out.println("Lots of damage, only some buildings fall");
        }
        else if (magnitude >= 4.5) {
            System.out.println("Only poorly constructed are damaged");
        }
        else {
            System.out.println("A lawn chair falls down");
        }
        
    }
}
