package uk.ac.westminster.tutorialWork;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/Hello")
    public String returnHello(){
        return "Hello";
    }

    @GetMapping("/Goodbye")
    public String returnGoodbye(){
        return "Goodbye";
    }

    @GetMapping("/Status")
    public String returnStatus(){
        return "API is running - " + LocalDate.now().toString();
    }

}
