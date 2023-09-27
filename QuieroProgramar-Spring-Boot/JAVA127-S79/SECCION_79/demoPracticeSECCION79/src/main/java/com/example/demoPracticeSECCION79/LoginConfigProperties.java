package com.example.demoPracticeSECCION79;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:login.properties")
})
public class LoginConfigProperties {
}
