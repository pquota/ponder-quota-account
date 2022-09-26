package io.github.pquota.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"io.github.pquota", "io.github.ponderyao.ddd"})
public class PonderQuotaAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(PonderQuotaAccountApplication.class, args);
    }
    
}
