package org.example.springmultipleappcontexts.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
@ComponentScan("org.example.springmultipleappcontexts.parent")
public class ParentConfig {


}
