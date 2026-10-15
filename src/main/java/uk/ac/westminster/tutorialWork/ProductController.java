package uk.ac.westminster.tutorialWork;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("products")
    public List<Product> returnId(){
        return productService.returnAll();
    }

    @GetMapping("products/{id}")
    public Product getId(@PathVariable Long id){
         return productService.newProduct(id).orElse(null);
    }


    @GetMapping("/products/search")
    public Product getName(@RequestParam String name){return productService.getProductById(name).orElse(null);}

    @PostMapping("products")
    public Product addProduct(@RequestBody Product p){
        return productService.addProduct(p);
    }

    @DeleteMapping("products")
    public void deleteProduct(@RequestBody Long id){
        productService.deleteProduct(id);
    }



}
