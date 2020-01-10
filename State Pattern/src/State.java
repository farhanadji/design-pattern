public interface State {
    State pull(State state);
}
