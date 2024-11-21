package A_OOP.Task2;

public class Task {

    String title;

    String executor;

    Task subTask;


    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                "executor" + executor + '\'' +
                '}';
    }

    public Task(String title) {
        this.title = title;
    }
}
