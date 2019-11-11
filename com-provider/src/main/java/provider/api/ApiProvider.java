package provider.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import service.IDemoService;

import java.io.IOException;

public class ApiProvider {

    public static void main(String[] args) throws IOException {
        ServiceConfig<IDemoService> serviceConfig = new ServiceConfig<IDemoService>();
        serviceConfig.setApplication(new ApplicationConfig("api-provider"));
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.199.179:2181"));
        serviceConfig.setProtocol(new ProtocolConfig("dubbo", 20880));
        serviceConfig.setInterface(IDemoService.class);
        serviceConfig.setRef(new DemoServiceImpl());
        serviceConfig.export();
        System.out.println("api-provider is running");
        System.in.read();
    }
}
