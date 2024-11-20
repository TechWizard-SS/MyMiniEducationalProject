package A_OOP.Task1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Ivan", "Ivan@gmail.com");
        Task task1 = new Task("Выучить ООП");
        Task task2 = new Task("Iзучить принципы ООП более глубже, и начать готовиться к собесам");

        System.out.println(employee);
        System.out.println(task1);
        System.out.println(task2);

        task1.addTask(employee);
        System.out.println(task1);

        Task task = new Task("Description");
        task.status = "test";

        System.out.println(task);

        Test test = new Test("Test");
        System.out.println(test);
    }
}
