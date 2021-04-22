import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User user= (User) context.getBean("getUser1");
        System.out.println(user.getName());
    }
}
