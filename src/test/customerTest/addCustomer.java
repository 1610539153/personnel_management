package customerTest;

import com.iotek.po.*;
import com.iotek.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/17.
 */
public class addCustomer {
    public static void main(String[] args) {
//        SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm:ss");
//        String str = sdf.format(new Date());
//        String intNumber = str.substring(0,str.indexOf(":"));
//        if(17<Integer.parseInt(intNumber)||Integer.parseInt(intNumber)<18){
//            System.out.println(Integer.parseInt(intNumber));
//        }
        String d=new SimpleDateFormat("MM").format(new Date());
        Integer.parseInt(d);
        System.out.println(d);


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        CustomerService customerService = (CustomerService) context.getBean("customerService");
//        Customer customer =new Customer();
//        customer.setCustomerName("1");
//        customer.setCustomerPassword("123456");
//        boolean b = customerService.addCustomer(customer);
//        System.out.println(b);


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        TrainWordListService trainWordListService = ( TrainWordListService) context.getBean("trainWordListService");
//        TrainWordList trainWordList =new TrainWordList();
//        trainWordList.setEmpId(34);
//        trainWordList.setTrainId(54);
//        boolean b =trainWordListService.additionTrainWordList(trainWordList);
//        System.out.println(b);

    }
}
