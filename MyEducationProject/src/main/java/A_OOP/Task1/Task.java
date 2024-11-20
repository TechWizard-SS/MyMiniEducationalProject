package A_OOP.Task1;

public class Task {
    private int number;
    protected String status;
    protected String description;
    Employee employee;

    static int taskNumberCount = 0;

    public Task(String description){
        taskNumberCount++;
        number = taskNumberCount;
        this.description = description;
    }



    public String addTask(Employee employee){
        this.employee = employee;
        return status = "Created";
    }

    @Override
    public String toString() {
        return "Task{" +
                "number=" + number +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                '}';
    }
}
