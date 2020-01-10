public class Medium implements State {
    @Override
    public State pull(State state) {
        System.out.println("Medium");
        return new High();
    }
}
