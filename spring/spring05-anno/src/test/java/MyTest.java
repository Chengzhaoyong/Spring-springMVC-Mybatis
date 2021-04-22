import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }

}
