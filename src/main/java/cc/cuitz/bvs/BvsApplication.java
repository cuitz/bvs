package cc.cuitz.bvs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cc.cuitz.bvs.mapper")
public class BvsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BvsApplication.class, args);
    }

}
