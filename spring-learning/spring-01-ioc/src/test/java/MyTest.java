import com.ysx.dao.UserDaoMysqlIml;
import com.ysx.service.UserService;
import com.ysx.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static  void main(String[] args){
        //用户实际调用的是业务层，dao层他们不需要接触
//        UserService userService = new UserServiceImp();
//        ((UserServiceImp) userService).setUserDao(new UserDaoMysqlIml());
//        userService.getUser();
        //获取ApplicationContext;
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImp userServiceImpl = (UserServiceImp) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
