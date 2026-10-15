package uk.ac.westminster.tutorialWork;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    @GetMapping("{id}")
    public Product returnId(@PathVariable Long id){
        return new Product(id, "Laptop", 699.99);
    }




}
