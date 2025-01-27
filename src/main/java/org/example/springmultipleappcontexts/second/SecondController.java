package org.example.springmultipleappcontexts.second;

import org.example.springmultipleappcontexts.first.MyFirstService;
import org.example.springmultipleappcontexts.parent.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecondController {

    private final MySecondService myService;

    public SecondController(MySecondService myService) {
        this.myService = myService;
    }

    @GetMapping("")
    public ResponseEntity<String> getProps() {
        return ResponseEntity.ok(myService.getProps());
    }
}
