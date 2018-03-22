package customerTest;

import com.iotek.po.*;
import com.iotek.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/3/17.
 */
public class addCustomer {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        CustomerService customerService = (CustomerService) context.getBean("customerService");
//        Customer customer =new Customer();
//        customer.setCustomerName("1");
//        customer.setCustomerPassword("123456");
//        boolean b = customerService.addCustomer(customer);
//        System.out.println(b);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
     RecruitMessageService recruitMessageService = ( RecruitMessageService) context.getBean("recruitMessageService");
        List<RecruitMessage> recruitMessages = recruitMessageService.seekRecruitMessage();
        for(RecruitMessage r:recruitMessages){
            System.out.println(r);
        }
    }
}
