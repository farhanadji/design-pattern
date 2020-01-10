public abstract class Employee {
    protected Mediator mediator;
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String msg){
        mediator.sendMessage(this, msg);
    }

    public void receiveMessage(String msg){
        System.out.println(this.getName() + " receive : " + msg);
    }

    public abstract String employeeType();
}
