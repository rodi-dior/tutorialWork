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

    public List<Product> addProduct(Product p){
        p.setId(nextId++);
        products.add(p);
        return products;
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Optional<Product> getProductById(String name){
        return products.stream().filter(p -> p.getName().equals(name)).findFirst();
    }

//    public ProductService(){
//        products.add(new DigitalProduct(nextId++,"Youtube", 19.99, "youtube.com", 50));
//        products.add(new PhysicalProduct(nextId++, "Table", 299.99, 50, "3d"));
//    }



}
