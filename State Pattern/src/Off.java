public class Off implements State {
    @Override
    public State pull(State state) {
        System.out.println("Off");
        return new Low();
    }
}
