package org.example.springmultipleappcontexts.second;

import org.example.springmultipleappcontexts.parent.MyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class MySecondService implements MyService {

    @Value("${my.props.p1}") String prop1;
    @Value("${my.props.p2}") String prop2;

    @Override
    public String getProps() {
        return prop1+ " " + prop2;
    }
}
