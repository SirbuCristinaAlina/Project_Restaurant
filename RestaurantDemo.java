package restaurant;

public class RestaurantDemo {

    public static void main(String[] args) {
        System.out.println("------------------------------- Menu ------------------------------");
        System.out.println("Pizza");
        ProductMenu pizza=new ProductMenu(new Pizza(),"Pizza");
        ProductMenu quatro_stagioni = new ProductMenu(new PizzaQuatroStagioni(),"Pizza");
        ProductMenu capriciosa = new ProductMenu(new PizzaCapriciosa(),"Pizza");
        ProductMenu hawaii = new ProductMenu(new PizzaHawaii(),"Pizza");
        
        pizza.addProducts(quatro_stagioni);
        pizza.addProducts(capriciosa);
        pizza.addProducts(hawaii);
        
        for(Product product: pizza.getProducts()){
        System.out.println(product);
        }
        ////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("Drinks");
        ProductMenu drinks=new ProductMenu(new Drink(),"Drinks");
        ProductMenu coke = new ProductMenu(new Coke(),"Drinks");
        ProductMenu lemonade = new ProductMenu(new Lemonade(),"Drinks");
        ProductMenu water = new ProductMenu(new Water(),"Drinks");
        
        drinks.addProducts(coke);
        drinks.addProducts(lemonade);
        drinks.addProducts(water);
        
        for(Product product: drinks.getProducts()){
        System.out.println(product);
        }        
        ////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println("Deserts");
        ProductMenu deserts=new ProductMenu(new IceCream(),"Deserts");
        ProductMenu icecream = new ProductMenu(new IceCream(),"Deserts");
        ProductMenu pancakes = new ProductMenu(new Pancakes(),"Deserts");
        
        deserts.addProducts(icecream);
        deserts.addProducts(pancakes);
        
        for(Product product: deserts.getProducts()){
        System.out.println(product);
        }        
        System.out.println();
        System.out.println("------------------------------ Orders -----------------------------");
        System.out.println();
        OrderBuilder order=new OrderBuilder();
        
        System.out.println("Order Client 1");
        Order order1 = order.order_client1();
        order1.showProducts();
        System.out.println("Total cost: "+order1.getCost()+" RON.");
        
        System.out.println();
        
        System.out.println("Order Client 2");
        Order order2 = order.order_client2();
        order2.showProducts();
        System.out.println("Total cost: "+order2.getCost()+" RON.");
        
        System.out.println();
        
        System.out.println("Order Client 3");
        Order order3 = order.order_client3();
        order3.showProducts();
        System.out.println("Total cost: "+order3.getCost()+" RON.");
    }
    
}
