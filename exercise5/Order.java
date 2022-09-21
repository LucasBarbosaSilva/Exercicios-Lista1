package exercise5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems;

    public Order (Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
        orderItems = new ArrayList<OrderItem>();
    }

    public void addItem(OrderItem orderItem){
        this.orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        int i = this.orderItems.indexOf(orderItem);
        this.orderItems.remove(i);
    }

    public double total(){
        double total = 0;
        for (OrderItem order: this.orderItems){
            total = total + order.subTotal();
        }
        return total;
    }

}   
