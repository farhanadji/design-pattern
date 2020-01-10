public class FanMachine {
    State current;

    public FanMachine() {
        this.current = new Off();
    }

    public void pull(){
        current = current.pull(current);
    }
}
