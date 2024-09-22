package package4;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(Fruit other) {
        return Integer.compare(this.quantity, other.quantity); // Sort by quantity
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }
}
