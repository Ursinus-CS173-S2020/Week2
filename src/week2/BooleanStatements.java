package week2;

/**
 * This is the example we went over in class
 */

public class BooleanStatements {
    public static boolean myBooleanStatement(boolean a, boolean b) {
        boolean result = a && b || !a;
        return result;
    }
    
    public static void main(String[] args) {
        boolean a, b;
        
        
        a = true;
        b = true;
        System.out.print("a = " + a + ", b = " + b + ": ");
        System.out.println(myBooleanStatement(a, b));
        
        a = true;
        b = false;
        System.out.print("a = " + a + ", b = " + b + ": ");
        System.out.println(myBooleanStatement(a, b));
        
        a = false;
        b = true;
        System.out.print("a = " + a + ", b = " + b + ": ");
        System.out.println(myBooleanStatement(a, b));
        
        a = false;
        b = false;
        System.out.print("a = " + a + ", b = " + b + ": ");
        System.out.println(myBooleanStatement(a, b));
    }
}