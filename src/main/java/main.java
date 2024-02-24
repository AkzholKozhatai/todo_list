import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        User user = context.getBean(User.class);
        Task task = context.getBean(Task.class);

        System.out.println("User's name: " + user.getName());
        System.out.println("Task: " + task.getTaskName());
        System.out.println("User's Task: " + user.getName() + " "+ user.getTask());

        context.close();
    }
}