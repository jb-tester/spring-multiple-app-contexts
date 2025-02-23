package org.example.springmultipleappcontexts.second;

import org.example.springmultipleappcontexts.parent.CommonService;
import org.example.springmultipleappcontexts.parent.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class MySecondService implements MyService {

    @Value("${my.props.p1}") String prop1;
    @Value("${my.props.p2}") String prop2;

    @Autowired
    CommonService commonService;

    @Autowired
    GenericApplicationContext ctx;

    @EventListener
    public void on(ContextRefreshedEvent event) {
        System.out.println("!!!!!!!!!!!!!!!!!!!");
        System.out.println("current class:");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("event context:");
        System.out.println(event.getApplicationContext().getClass().getSimpleName());
        System.out.println(event.getApplicationContext().getId());
        System.out.println("current context:");
        System.out.println(ctx.getId());
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println("!!!!!!!!!!!!!!!!!!!");
    }
    
    @Override
    public String getProps() {
        return prop1+ " " + prop2;
    }
    @Override
    public String getCommonService() {
        return commonService.toString();
    }
}
