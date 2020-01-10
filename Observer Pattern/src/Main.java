public class Main {

    public Main() {
        System.out.println("**** Observer Pattern ****\n");
        Observer obs1 = new CurrencyObserver("Roy");
        Observer obs2 = new CurrencyObserver("Martin");
        Observer obs3 = new CurrencyObserver("Dalas");

        Subscribe subs = new Subscribe();
        subs.register(obs1);
        subs.register(obs2);
        subs.register(obs3);

        subs.setValue(1245);
        System.out.println();

        subs.unregister(obs2);

        subs.setValue(1269);
        System.out.println();

    }

    public static void main(String[] args) {
        new Main();
    }
}
