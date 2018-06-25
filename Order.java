package restaurant;

import java.util.List;
import java.util.ArrayList;

public class Order {
    List<Product> products = new ArrayList<Product>();
    
    public void addProduct(Product product){
        products.add(product);
    }
    public float getCost(){
        float cost = 0.0f;
        for(Product product:products){
            cost+=product.cost();
        }
        return cost;
    }
    public void showProducts(){
        for(Product product:products){
            System.out.print("Name of product: "+product.name());
            System.out.println(". Cost of product: "+product.cost()+" RON.");
        }
    }
}
