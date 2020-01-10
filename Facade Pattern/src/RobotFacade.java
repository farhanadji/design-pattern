public class RobotFacade {
    RobotColor rColor;
    RobotHands rHands;
    RobotBody rBody;

    public RobotFacade(){
        rColor = new RobotColor();
        rHands = new RobotHands();
        rBody = new RobotBody();
    }

    public void constructMilanoRobot(){
        RobotBody.createRobot();
        System.out.println("Creating of a Milano Robot Start.");
        rColor.setDefaultColor();
        rHands.setMailanoHands();
        rBody.createHands();
        rBody.createRemaingParts();
        System.out.println("Milano Robot Creation End.");
        System.out.println();
    }

    public void constructRobonautRobot(){
        RobotBody.createRobot();
        System.out.println("Creating of a Robonaut Robot Start.");
        rColor.setGreenColor();
        rHands.setRobotnautHands();
        rBody.createHands();
        rBody.createRemaingParts();
        System.out.println("Robonaut Robot Creation End.");
        System.out.println();
    }

    public void destroyMilanoRobot(){
        RobotBody.destroyRobot();
        System.out.println("Milano Robot's destruction process is started.");
        rHands.resetMilanoHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println("Milano Robot's destruction process is over.");
        System.out.println();
    }

    public void destroyRobonautRobot(){
        RobotBody.destroyRobot();
        System.out.println("Robonaut Robot's destruction process is started.");
        rHands.resetRobonautHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println("Robonaut Robot's destruction process is over.");
        System.out.println();
    }
}
