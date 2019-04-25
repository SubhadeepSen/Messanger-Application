package messanger.api.ui.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"messanger.api.ui"})
public class MessangerUiStarter {

	public static void main(String[] args) {
		SpringApplication.run(MessangerUiStarter.class, args);
	}
}
