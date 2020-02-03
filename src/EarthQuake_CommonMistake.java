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
        double richter = in.nextDouble();
        if (richter >= 8.0) {
            System.out.println("Every building collapses");
        }
        if (richter >= 7.0) {
            System.out.println("Many buildings fall");
        }
        if (richter >= 6.0) {
            System.out.println("Many bldgs damaged, a few collapse");
        }
        else if (richter < 6.0) {
            System.out.println("A lawn chair falls over");
        }
        
        // A bunch of if/else statements
        
    }
}
