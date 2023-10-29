import pkg.TaskItem;
import pkg.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataStructures tasks = new DataStructures();
        tasks.printTasks();
        List<TaskItem> statusTasks = tasks.getByStatus(TaskItem.Status.IN_PROGRESS);
        for (TaskItem it: statusTasks) {
            System.out.println("test");
            System.out.println(it.toStr());
        }
        List<TaskItem> idTasks = tasks.getByGreaterId();
    }

}
