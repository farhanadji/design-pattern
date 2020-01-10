public class Main {
    public Main() {
        FanMachine machine = new FanMachine();
        machine.pull();
        machine.pull();
        machine.pull();
        machine.pull();
        machine.pull();
        machine.pull();
    }

    public static void main(String[] args) {
        new Main();
    }
}
