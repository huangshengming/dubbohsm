package consumer.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IDemoService;

public class DemoConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-demo-consumer.xml"});
        context.start();

        while (true){
            try {
                Thread.sleep(2000);
                IDemoService demoService = context.getBean(IDemoService.class);
                String result = demoService.sayHello(" world.\n");
                System.out.print(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
