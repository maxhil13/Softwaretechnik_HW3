public class Elevator {

    public static int currentFloor;
    int destinationFloor;

    private Elv_States State = new Elv_States();



    public Elevator(int destinationFloor, int currentFloor) {
        this.destinationFloor = destinationFloor;
        Elevator.currentFloor = currentFloor;
        System.out.println("*** Destination floor is: " + destinationFloor);
        checkDestinationFloor();
    }



    private void goUp() {
        if (currentFloor < destinationFloor) {
            State.setCurrentStateToMovingUp();
            currentFloor++;
            goUp();
        } else if (currentFloor == destinationFloor) {
            arriveAtFloor();
        }
    }

    private void goDown() {
        if (currentFloor > destinationFloor) {
            State.setCurrentStateToMovingDown();
            currentFloor--;
            goDown();
        } else if (currentFloor == destinationFloor) {
            arriveAtFloor();
        }
    }

    private void arriveAtFloor() {
        State.setCurrentStateToIdle();
        System.out.println("Arrived at requested floor. " + "Floor: " + currentFloor);
        exitElevator();
    }

    private void exitElevator() {
        System.out.println("Exit the elevator.");
        System.exit(0);
    }

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
