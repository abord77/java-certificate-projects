
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            this.history.add(super.getBalance());
            return 0.0;
        }
        if (amount > super.getBalance()) {
            double allThatWeCan = super.getBalance();
            super.setBalance(0.0);
            this.history.add(super.getBalance());
            return allThatWeCan;
        }

        super.setBalance(super.getBalance() - amount);
        this.history.add(super.getBalance());
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName()
                + "\nHistory: " + this.history()
                + "\nLargest amount of product: " + this.history.maxValue()
                + "\nSmallest amount of product: " + this.history.minValue()
                + "\nAverage: " + this.history.average() + "");
    }
}
