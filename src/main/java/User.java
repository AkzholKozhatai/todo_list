public class User {
    private String name;
    private Task task;

    public User() {

    }

    public User(String name, Task task) {
        this.name = name;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "User's Task: " + name + " " + task.getTaskName();
    }
}