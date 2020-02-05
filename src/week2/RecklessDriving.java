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
        if (speedLimit > 65) {
            if (speed > 80) {
                message = "Reckless";
            }
            else {
                message = "OK";
            }
        }
        else {
            if (speed <= speedLimit + 15) {
                message = "Ok";
            }
            else {
                message = "Reckless";
            }
        }
        return message;
    }
    
    public static void main(String[] args) {
        int speed, speedLimit;
        
        speedLimit = 60;
        speed = 65;
        System.out.print("Doing " + speed + " in a " + speedLimit + ": ");
        System.out.println(assessDriving(speedLimit, speed));
        
        speedLimit = 55;
        speed = 71;
        System.out.print("Doing " + speed + " in a " + speedLimit + ": ");
        System.out.println(assessDriving(speedLimit, speed));
        
        speedLimit = 70;
        speed = 81;
        System.out.print("Doing " + speed + " in a " + speedLimit + ": ");
        System.out.println(assessDriving(speedLimit, speed));
    }
}
