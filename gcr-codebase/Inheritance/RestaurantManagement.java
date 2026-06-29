package ScenarioBasedOOPs.Inheritance;

public class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef cooks food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter serves customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Raj", 1);
        Waiter waiter = new Waiter("Aman", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}