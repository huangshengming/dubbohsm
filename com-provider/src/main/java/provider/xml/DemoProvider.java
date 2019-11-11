package provider.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DemoProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-demo-provider.xml"});
        context.start();

        System.in.read();
    }
}
