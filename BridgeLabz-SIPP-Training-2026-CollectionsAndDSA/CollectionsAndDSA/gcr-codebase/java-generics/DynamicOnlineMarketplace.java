import java.util.*;

class BookCategory {
}

class ClothingCategory {
}

class GadgetCategory {
}

class Product<T> {
    String name;
    double price;
    T category;

    Product(String n, double p, T c) {
        name = n;
        price = p;
        category = c;
    }

    public String toString() {
        return name + " " + price;
    }
}

public class DynamicOnlineMarketplace {
    static <T extends Product<?>> void applyDiscount(T p, double per) {
        p.price -= p.price * per / 100;
    }

    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();
        Product<BookCategory> b = new Product<>("Java", 500, new BookCategory());
        applyDiscount(b, 10);
        catalog.add(b);
        System.out.println(catalog);
    }
}
