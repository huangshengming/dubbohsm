package consumer.annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.IDemoService;

@Component
public class ServiceComponent implements IDemoService {

    @Reference
    private IDemoService demoService;

    public String sayHello(String string) {
        return demoService.sayHello(string);
    }
}
