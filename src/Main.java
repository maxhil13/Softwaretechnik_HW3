import java.util.Scanner;

/**
 * @author Max Hilgers
 */
public class Main {

    // Hier kann man den currentFloor aendern, auf dem sich der Aufzug am Anfang befindet.
    private final static int currentFloor = 5;


    public static void main(String[] args) {
        start();
    }

    /**
     * Diese Methode sorgt dafuer, dass nur zulaessige Eingaben angenommen werden.
     */
    private static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Current Floor is: " + currentFloor);
        System.out.println("Enter destination floor: (0 to 10):");

        int dest_floor = -1;

        if (in.hasNextInt()) {
            dest_floor = in.nextInt();
        } else {
            System.err.println("Please only use numbers.");
            start();
        }

        if (dest_floor >= 0 && dest_floor <= 10) {
            System.out.println("------------------------------------");
            new Elevator(dest_floor, currentFloor);
            in.close();
        } else {
            System.err.println("The chosen floor is not a floor between 0 and 10.");
            start();
        }
    }
}
