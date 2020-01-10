public class High implements State {
    @Override
    public State pull(State state) {
        System.out.println("High");
        return new Off();
    }
}
