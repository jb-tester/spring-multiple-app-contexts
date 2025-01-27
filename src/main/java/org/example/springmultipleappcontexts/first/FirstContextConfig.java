package org.example.springmultipleappcontexts.first;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.springmultipleappcontexts.first")
@EnableAutoConfiguration
@PropertySource("classpath:first.properties")
public class FirstContextConfig {
}
