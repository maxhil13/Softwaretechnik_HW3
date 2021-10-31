public class Elv_States {

    public String movingUp = "movingUp";
    public String movingDown = "movingDown";
    public String idle = "idle";

    public String currentState;


    public Elv_States() {
        this.currentState = idle;
    }

    public void setCurrentStateToMovingUp() {
        this.currentState = movingUp;
    }

    public void setCurrentStateToMovingDown() {
        this.currentState = movingDown;
    }

    public void setCurrentStateToIdle() {
        this.currentState = idle;
    }
}
