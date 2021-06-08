import com.ysx.config.ysx;
import com.ysx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ysx.class);
        User getUser = (User)context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
