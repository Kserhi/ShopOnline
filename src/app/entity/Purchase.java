package app.entity;

public class Purchase {

        private final int quota;
        private final double price;

        private final boolean delivery;

    public Purchase(int quota, double price, boolean delivery) {
        this.quota = quota;
        this.price = price;
        this.delivery = delivery;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDelivery() {
        return delivery;
    }
}
