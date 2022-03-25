package A1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("A1")
@SpringBootApplication
public class A2Application {
    public static void main(String[] args) {
        SpringApplication.run(A2Application.class, args);
    }
}
