package org.example.config;

import org.example.YandexEda;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"org.example"})
public class AppConfig {

    @Bean(name = "YandexEdagoi")
    @Scope("singleton")
//    @Scope("prototype")
    YandexEda getEda(){
        return new YandexEda();
    }
}
