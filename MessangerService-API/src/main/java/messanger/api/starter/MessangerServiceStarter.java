package messanger.api.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "messanger.api"})
public class MessangerServiceStarter {

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(MessangerServiceStarter.class, args);
    }
}
