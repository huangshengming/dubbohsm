package consumer.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConsumer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

        ServiceComponent serviceComponent = context.getBean(ServiceComponent.class);

        while (true){
            try {
                Thread.sleep(2000);
                String result = serviceComponent.sayHello("world.\n");
                System.out.print(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
