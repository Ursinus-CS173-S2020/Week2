/**
 * 
 * Purpose: To convert the floor button number
 * on an elevator to an actual floor number,
 * given that no floor is numbered 13
 */
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What floor button are you? ");
        int floor = in.nextInt();
        int actualFloor = -64;
        // TODO: Finish converting to actualFloor
        // and output the result
        if (floor < 13) {
            // The true block
            actualFloor = floor;
        }
        else if (floor == 13) {
            System.out.println("FATAL ERROR.  YOU MAY DIE");
        }
        else {
            // The false block
            actualFloor = floor-1;
        }
        System.out.println("The actual floor is " + actualFloor);
    }
}
