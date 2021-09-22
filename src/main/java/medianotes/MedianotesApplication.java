/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package medianotes;

import medianotes.service.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MedianotesApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MedianotesApplication.class);

        HelloWorldService helloWorldService = applicationContext.getBean(HelloWorldService.class);
        helloWorldService.printString();
    }
}
