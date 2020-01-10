public class Main {

    public Main(){
        System.out.println("**** Facade Pattern Demo ****\n");
        RobotFacade milanoRobotFacade = new RobotFacade();
        milanoRobotFacade.constructMilanoRobot();
        System.out.println("\n");
        RobotFacade robonautRobotFacade = new RobotFacade();
        robonautRobotFacade.constructRobonautRobot();
        System.out.println("\n");
        System.out.println("*** DESTROY ROBOT ***\n");
        milanoRobotFacade.destroyMilanoRobot();
        robonautRobotFacade.destroyRobonautRobot();

    }

    public static void main(String[] args) {
        new Main();
    }
}
