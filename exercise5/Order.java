package exercise5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems;

    public Order (Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
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

    public String momentFormated(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.moment);
    }

    public String summary(){
        String date = "Order moment: "+ momentFormated()+
                      "\nOrder status: "+ this.status +
                      "\nClient: "+ this.client.profile() +
                      "\nOrder items: \n";
        for (OrderItem order: this.orderItems){
            date = date + order.summary()+"\n";
        }
        date = date + this.total();
        return date;
    }

}   
