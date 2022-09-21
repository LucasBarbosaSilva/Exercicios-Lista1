package exercise5;

public enum OrderStatus{
    PENDING_PAYMENT(1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVED(4);

    private int value;
    private OrderStatus(int op){
        this.value = op;
    }

}