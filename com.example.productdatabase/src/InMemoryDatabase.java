import java.util.Arrays;

public class InMemoryDatabase implements ProductDatabase {
    private Product[] products;
    private int size;

    public InMemoryDatabase() {
        products = new Product[10];
        size = 0;
    }

    @Override
    public void save(Product product) {
        if (size == products.length) {

            products = Arrays.copyOf(products, products.length * 2);
        }
        products[size++] = product;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < size; i++) {
            if (products[i].getTitle().equals(productTitle)) {
                return products[i];
            }
        }
        return null;
    }

    public void printAllProducts() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].getTitle());
        }
    }
}
