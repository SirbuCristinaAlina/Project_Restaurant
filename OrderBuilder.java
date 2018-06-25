package restaurant;

public class OrderBuilder {
    public Order order_client1(){
        Order order = new Order();
        order.addProduct(new PizzaCapriciosa());
        order.addProduct(new IceCream());
        order.addProduct(new Lemonade());
        return order;
    }
        public Order order_client2(){
        Order order = new Order();
        order.addProduct(new PizzaQuatroStagioni());
        order.addProduct(new Pancakes());
        order.addProduct(new Coke());
        return order;
    }
        public Order order_client3(){
        Order order = new Order();
        order.addProduct(new PizzaHawaii());
        order.addProduct(new Water());
        return order;
    }
}
