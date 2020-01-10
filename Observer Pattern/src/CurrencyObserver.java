public class CurrencyObserver implements Observer {

    String nameOfObserver;
    public CurrencyObserver(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println( nameOfObserver + " has received an alert: 1 bytecoin is: USD " + updatedValue + "$");
    }
}
