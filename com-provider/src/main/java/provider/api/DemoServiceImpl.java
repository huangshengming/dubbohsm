package provider.api;

import service.IDemoService;

public class DemoServiceImpl implements IDemoService {
    public String sayHello(String string) {
        return "the result: hello" + string;
    }
}
