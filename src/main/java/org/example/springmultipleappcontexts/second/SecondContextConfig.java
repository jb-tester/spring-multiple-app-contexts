package org.example.springmultipleappcontexts.second;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.springmultipleappcontexts.second")
@EnableAutoConfiguration
@PropertySource("classpath:second.properties")
public class SecondContextConfig {
}
