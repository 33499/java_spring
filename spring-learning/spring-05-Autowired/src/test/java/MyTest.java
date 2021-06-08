import com.ysx.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void tenst1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people",People.class);
        people.getCat().shout();
        people.getDog().shout();
        System.out.println(people.getName());
    }
}
