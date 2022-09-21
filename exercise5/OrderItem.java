package exercise5;

public class OrderItem {
    private Product product;
    private int quantity;
    private double price;
    
    public OrderItem (int quantity, double price, Product product ){
        this.product = product;
        this.quantity = quantity;
        this.price = this.quantity * this.product.getPrice(); 
    }

    public double subTotal(){
        return this.price;
    }

    public String summary(){
        return this.product + " "+ this.quantity + " "+this.subTotal();
    }
}
