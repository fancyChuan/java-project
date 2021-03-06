package cn.fancychuan.mangospringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.fancychuan.mangospringdemo"})
public class MangoSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoSpringDemoApplication.class, args);
    }

}
