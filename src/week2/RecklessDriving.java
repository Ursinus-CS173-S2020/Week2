package week2;

public class RecklessDriving {
    
    /**
     * 
     * @param speedLimit An integer representing the speed limit
     * @param speed An integer representing the speed of a driver
     * @return A string with a message for that driver
     */
    public static String assessDriving(int speedLimit, int speed) {
        String message = "";
        return message;
    }
    
    public static void main(String[] args) {
        int speed, speedLimit;
        
        speedLimit = 60;
        speed = 65;
        System.out.print("Doing " + speed + " in a " + speedLimit + ": ");
        System.out.println(assessDriving(speedLimit, speed));
    }
}