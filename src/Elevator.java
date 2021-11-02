
/**
 * @author Max Hilgers
 */
public class Elevator {

    public static int currentFloor;
    int destinationFloor;

    private final Elv_States State = new Elv_States();


    /**
     * Speichert destinationFloor und currentFloor und startet die Fahrstuhlfahrt mit der Methode checkDestinationFloor().
     * @param destinationFloor Die Etage zu der man moechte.
     * @param currentFloor Die Etage auf der man sich befindet.
     */
    public Elevator(int destinationFloor, int currentFloor) {
        this.destinationFloor = destinationFloor;
        Elevator.currentFloor = currentFloor;
        System.out.println("*** Destination floor is: " + destinationFloor);
        checkDestinationFloor();
    }


    /**
     * Diese Methode faehrt solange eine Etage hoeher, bis man auf der gewuenschten Etage angekommen ist.
     * Ausserdem wird der State fuer die Dauer der Fahrt auf movingUp gesetzt. Nach Ankunft wieder auf idle.
     */
    private void goUp() {
        if (currentFloor < destinationFloor) {
            State.setCurrentStateToMovingUp();
            currentFloor++;
            goUp();
        } else if (currentFloor == destinationFloor) {
            arriveAtFloor();
        }
    }

    /**
     * Diese Methode faehrt solange eine Etage niedriger, bis man auf der gewuenschten Etage angekommen ist.
     * Ausserdem wird der State fuer die Dauer der Fahrt auf movingDown gesetzt. Nach Ankunft wieder auf idle.
     */
    private void goDown() {
        if (currentFloor > destinationFloor) {
            State.setCurrentStateToMovingDown();
            currentFloor--;
            goDown();
        } else if (currentFloor == destinationFloor) {
            arriveAtFloor();
        }
    }

    /**
     * Diese Methode setzt den State auf idle und gibt auf der Konsole aus, dass man angekommen ist.
     * Ausserdem wird exitElevator() ausgefuehrt.
     */
    private void arriveAtFloor() {
        State.setCurrentStateToIdle();
        System.out.println("Arrived at requested floor. " + "Floor: " + currentFloor);
        exitElevator();
    }

    /**
     * Gibt auf der Konsole aus, dass man den Aufzug verlassen hat.
     * Beendet ausserdem die Anwendung.
     */
    private void exitElevator() {
        System.out.println("Exit the elevator.");
        System.exit(0);
    }

    /**
     * Diese Methode prueft, ob der Aufzug nach oben oder unten fahren muss.
     */
    private void checkDestinationFloor() {
        if (destinationFloor == currentFloor) {
            System.out.println("You are already on this floor.");
            exitElevator();
        } else if (destinationFloor > currentFloor) {
            goUp();
        } else {
            goDown();
        }
    }
}
