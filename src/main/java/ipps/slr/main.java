package ipps.slr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class main {

    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }


}