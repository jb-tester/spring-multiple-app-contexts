package org.example.springmultipleappcontexts.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class CommonService {

    final
    GenericApplicationContext ctx;

    public CommonService(GenericApplicationContext ctx) {
        this.ctx = ctx;
        System.out.println("!!!!!!!!!!!!!!!!!!!");
        System.out.println("current class:");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("current context:");
        System.out.println(ctx.getId());
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println("!!!!!!!!!!!!!!!!!!!");
    }

    @EventListener
    public void on(ContextRefreshedEvent event) {
        System.out.println("!!!!!!!!! context was refreshed !!!!!!!!!!");
        System.out.println("event context:");
        System.out.println(event.getApplicationContext().getClass().getSimpleName());
        System.out.println(event.getApplicationContext().getId());
        System.out.println("!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "CommonService" ;
    }
}
