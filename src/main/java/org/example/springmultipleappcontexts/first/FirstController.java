package org.example.springmultipleappcontexts.first;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {

    private final MyFirstService myService;

    public FirstController(MyFirstService myService) {
        this.myService = myService;
    }

    @GetMapping("")
    public ResponseEntity<String> getProps() {
        return ResponseEntity.ok(myService.getProps());
    }
}
