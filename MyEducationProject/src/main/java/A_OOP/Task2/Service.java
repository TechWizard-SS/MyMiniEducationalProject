package A_OOP.Task2;

public class Service {
    public static void main(String[] args) {
        var task0 = new Task("Task0");

        var task1 = new Task("Task1");

        task0.subTask = task1;

        task1.subTask = task0;

        System.out.println(task1);
        setExecutors(null, "Employee");


    }


    public static void setExecutors(Task task, String executor) {
        if (task == null){
            throw new RuntimeException("Задача не может быть null");
        }

        if (task.executor == null) {
            task.executor = executor;
        }
        var subtask = task.subTask;
        if (subtask == null) {
            return;
        }
        setExecutors(task.subTask, executor);
    }

}
