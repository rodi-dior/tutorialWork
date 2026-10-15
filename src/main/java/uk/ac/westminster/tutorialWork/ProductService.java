package uk.ac.westminster.tutorialWork;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<Product>();
    private Long nextId = 1L;

    public List<Product> returnAll(){
        return products;
    }

    public Optional<Product> newProduct(Long id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public Product addProduct(Product p){
        p.setId(nextId++);
        nextId++;
        products.add(p);
        return p;
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }


    public Optional<Product> getProductById(String name){
        return products.stream().filter(p -> p.getName().equals(name)).findFirst();
    }




}
