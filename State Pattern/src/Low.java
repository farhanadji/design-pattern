public class Low implements State {
    @Override
    public State pull(State state) {
        System.out.println("Low");
        return new Medium();
    }
}
