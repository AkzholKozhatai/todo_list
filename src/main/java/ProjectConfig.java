import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public User user(Task task) {
        User user = new User();
        user.setName("Akzhol");
        user.setTask(task);
        return user;
    }


    @Bean
    public Task task() {
        Task task = new Task();
        task.setTaskName("planirovat zadachi");
        return task;
    }

    @Bean
    public Number number() {
        Number number = new Number();
        number.setValue(10);
        return number;
    }


}

