package exercise5;

public class OrderItem {
    private Product product;
    private int quantity;
    private double price;
    
    public OrderItem (String name, double price, int quantity){
        this.product = new Product(name, price);
        this.quantity = quantity;
        this.price = this.quantity * this.product.getPrice(); 
    }

    public double subTotal(){
        return this.price;
    }
}
