package provider.annotation;

import com.alibaba.dubbo.config.annotation.Service;
import service.IDemoService;

@Service
public class AnnotationDemoServiceImpl implements IDemoService {
    public String sayHello(String string) {
        return "the result: hello " + string;
    }
}
