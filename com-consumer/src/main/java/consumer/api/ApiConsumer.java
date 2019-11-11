package consumer.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import service.IDemoService;

public class ApiConsumer {

    public static void main(String[] args) {
        ReferenceConfig<IDemoService> referenceConfig = new ReferenceConfig<IDemoService>();
        referenceConfig.setApplication(new ApplicationConfig("api-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.199.179:2181"));
        referenceConfig.setInterface(IDemoService.class);
        IDemoService demoService = referenceConfig.get();
        while (true){
            try {
                Thread.sleep(2000);
                String result = demoService.sayHello("world.\n");
                System.out.println(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
