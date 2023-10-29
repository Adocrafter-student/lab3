package pkg;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskItem.Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskItem.Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskItem.Status.COMPLETED)
        );
    }

    public List<TaskItem> getTasks() {
        return new ArrayList<>(tasks);
    }
    public List<TaskItem> getByStatus(TaskItem.Status status) {
        ArrayList<TaskItem> current = new ArrayList<>();
        for (TaskItem t: this.tasks) {
            if (t.getStatus() == status) {
               current.add(t);
            }
        }
        return current;
    }

    public List<TaskItem> getByGreaterId() {
        ArrayList<TaskItem> current = new ArrayList<>();
        for (TaskItem t: this.tasks) {
            if (t.getTaskId() >=2) {
                current.add(t);
            }
        }
        return current;
    }

    public void printTasks(){
        for (TaskItem t: this.tasks) {
            System.out.println(t.toStr());
        }
    }
}
