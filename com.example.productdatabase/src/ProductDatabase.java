public interface ProductDatabase {
    void save(Product product);
    Product findByTitle(String productTitle);
}
