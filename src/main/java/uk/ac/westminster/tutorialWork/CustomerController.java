package uk.ac.westminster.tutorialWork;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {


    @GetMapping("/{id}")
    public Customer returnCustomerInfo(@PathVariable Long id){
        Address address = new Address("115 Cavendish Street", "London", "P7 BK1");


        return new Customer(id, "Rodi", "rodipaker06@gmail.com", address);

    }


}
