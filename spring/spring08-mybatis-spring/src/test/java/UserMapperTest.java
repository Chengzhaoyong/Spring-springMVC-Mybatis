import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class UserMapperTest {

    @Test
    public void test() throws Exception{
        String re="mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(re);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }

    }

    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
