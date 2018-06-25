package restaurant;

import java.util.ArrayList;
import java.util.List;

public class ProductMenu implements Product{
     public List<Product> products;
     public Product product;
     public String category;
     
     public ProductMenu (Product product, String category){
         this.product=product;
         this.category=category;
         this.products=new ArrayList<Product>();
     }
     public void addProducts(Product product){
         products.add(product);
     }
     public void removeProducts(Product product){
         products.remove(product);
     }
     public List<Product> getProducts(){
         return products;
     }
     public String name(){
         return product.name();
     }
     public float cost(){
         return product.cost();
     }
     public String toString(){
         return "The product: "+name()+". Category: "+category+". Price: "+cost()+" RON.";
     }
}
