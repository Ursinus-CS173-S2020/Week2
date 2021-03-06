package week2;
/**
 * Purpose: To demonstrate AND (&&) conditions
 * in Java with a little program to print out
 * "Let's go outside!" if the temperature is between
 * 60 degrees and 80 degrees, including 60 but
 * not including 80.  Otherwise, print 
 * "I think I'll stay inside..."
 */
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Temperature outside is: ");
        int temp = in.nextInt();
        if (temp <= 80 && temp >= 60) {
            System.out.println("I think I'll go outside");
        }
        else {
            System.out.println("Nah");
        }
    }
}
