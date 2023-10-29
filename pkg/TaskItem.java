package pkg;

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status status;
    public enum Status {
        TO_DO, IN_PROGRESS, COMPLETED, CANCELED
    }

    public TaskItem (int item, String description, Status status) {
        this.taskId = item;
        this.taskDescription = description;
        this.status =  status;
    }
    public int getTaskId () {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Status getStatus() {
        return status;
    }
    public void setTaskId (int taskId) {
        this.taskId = taskId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public String toStr() {
        return "TaskItem{" +
                "taskId=" + taskId +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStatus=" + status +
                '}';
    }
}
