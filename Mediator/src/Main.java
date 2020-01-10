public class Main {
    public Main() {
        System.out.println("*** Mediator Pattern ***\n");
        ConcreteMediator mediator = new ConcreteMediator();

        JuniorEmployee je1 = new JuniorEmployee(mediator, "Andy");
        JuniorEmployee je2 = new JuniorEmployee(mediator, "Jeje");
        SeniorEmployee se1 = new SeniorEmployee(mediator,"Jonas");
        Unknown un1 = new Unknown(mediator, "Anton");


        mediator.register(je1);
        mediator.register(je2);
        mediator.register(se1);
        je1.sendMessage("Halo semua!");
        un1.sendMessage("hai hai");
    }

    public static void main(String[] args) {
        new Main();
    }
}
