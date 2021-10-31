
/**
 * @author Max Hilgers
 */
public class Elv_States {

    public String movingUp = "movingUp";
    public String movingDown = "movingDown";
    public String idle = "idle";

    public String currentState;

    /**
     * Der Konstruktor setzt den currentState auf idle.
     */
    public Elv_States() {
        this.currentState = idle;
    }

    /**
     * Setzt den currentState auf movingUp.
     */
    public void setCurrentStateToMovingUp() {
        this.currentState = movingUp;
    }

    /**
     * Setzt den currentState auf movingDown.
     */
    public void setCurrentStateToMovingDown() {
        this.currentState = movingDown;
    }

    /**
     * Setzt den currentState auf idle.
     */
    public void setCurrentStateToIdle() {
        this.currentState = idle;
    }
}
