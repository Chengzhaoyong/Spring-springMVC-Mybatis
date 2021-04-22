import com.kuang.pojo.Address;
import com.kuang.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student) classPathXmlApplicationContext.getBean("student");
//        System.out.println(student.toString());


    }

    @Test
    public void test1(){
       ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        Address address = context.getBean("address", Address.class);
        System.out.println(address);
    }
}
