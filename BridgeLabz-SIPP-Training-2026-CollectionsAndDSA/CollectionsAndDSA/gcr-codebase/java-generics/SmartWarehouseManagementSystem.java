import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String n) {
        name = n;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String n) {
        super(n);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String n) {
        super(n);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String n) {
        super(n);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void add(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseManagementSystem {
    static void display(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items)
            System.out.println(i);
    }

    public static void main(String[] args) {
        Storage<Electronics> s = new Storage<>();
        s.add(new Electronics("Laptop"));
        display(s.getItems());
    }
}
