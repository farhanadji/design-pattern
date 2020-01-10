import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    List<Employee> participants = new ArrayList<>();

    @Override
    public void register(Employee employee) {
        participants.add(employee);
    }

    @Override
    public void sendMessage(Employee employee, String msg) {
        for (Employee emp: participants){
            if(participants.contains(employee)){
                try {
                    Thread.sleep(1000);
                    emp.receiveMessage(employee.getName() + " posts : " + msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                emp.receiveMessage("An outsider named " + employee.getName() + " is trying to send some messages.");
            }
        }
    }

    public void displayRegisteredEmployees(){
        System.out.println("At present, registered employees are : ");
        for (Employee employee: participants){
            System.out.println(employee);
        }
    }
}
