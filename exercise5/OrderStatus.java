package exercise5;

public enum OrderStatus{
    PENDING_PAYMENT(1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVED(4);

    private int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    private OrderStatus(int op){
        this.value = op;
    }

}