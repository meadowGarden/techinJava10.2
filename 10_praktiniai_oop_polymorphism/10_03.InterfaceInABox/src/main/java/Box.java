import java.util.ArrayList;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> inventory;

    public Box(double capacity) {
        this.capacity = capacity;
        inventory = new ArrayList<>();
    }

    public void add(Packable item) {
        if ((capacity - item.weight()) >= 0 ) {
            inventory.add(item);
            capacity -= item.weight();
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable item : inventory) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Box: %d items, total weight %.1f kg", inventory.size(), this.weight());
    }
}
