package week2;

/**
 * Here's another example involving 3 boolean variables
 */

public class BooleanStatements2 {
    public static boolean myBooleanStatement(boolean a, boolean b, boolean c) {
        boolean result = c && (!a || b) ;
        return result;
    }
    
    public static void main(String[] args) {
        // Don't worry about this code too much for now: it's magic
        // that tries all possibilities
        for (int a = 1; a >= 0; a--) {
            for (int b = 1; b >= 0; b--){
                for (int c = 1; c >= 0; c--) {
                    System.out.print("a = " + (a > 0));
                    System.out.print(", b = " + (b > 0));
                    System.out.print(", c = " + (c > 0));
                    boolean result = myBooleanStatement(a > 0, b > 0, c > 0);
                    System.out.println(": " + result);
                }
            }
        }
    }
}
