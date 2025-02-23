package org.example.springmultipleappcontexts.parent;

import org.example.springmultipleappcontexts.first.FirstContextConfig;
import org.example.springmultipleappcontexts.second.SecondContextConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;


public class SpringMultipleAppContextsApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().parent(ParentConfig.class)
                  .web(WebApplicationType.NONE)
                .child(FirstContextConfig.class)
                  .web(WebApplicationType.SERVLET)
                  .properties("server.port=8081")
                .sibling(SecondContextConfig.class)
                  .web(WebApplicationType.SERVLET)
                  .properties("server.port=8082")
                .run(args);
    }

}
