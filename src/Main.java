import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner in = new Scanner(System.in);

        System.out.println("Current Floor is 5");


        System.out.println("Enter destination floor: (0 to 10):");

        int dest_floor = -1;

        if (in.hasNextInt()) {
            dest_floor = in.nextInt();
        } else {
            System.err.println("Please only use numbers.");
            start();
        }

        if (dest_floor >= 0 && dest_floor <= 10) {
            System.out.println("--------------------------------------------");
            Elevator elv;
            elv = new Elevator(dest_floor, 5);
            in.close();
        } else {
            System.err.println("The chosen floor is not a floor between 0 and 10.");
            start();
        }
    }
}
