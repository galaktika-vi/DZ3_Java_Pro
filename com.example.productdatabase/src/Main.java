public class Main {
    public static void main(String[] args) {
        ProductDatabase database = new InMemoryDatabase();

        Product product1 = new Product("Apple");
        Product product2 = new Product("Banana");
        Product product3 = new Product("Orange");

        database.save(product1);
        database.save(product2);
        database.save(product3);

        String searchTitle = "Banana";
        Product foundProduct = database.findByTitle(searchTitle);

        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getTitle());
        } else {
            System.out.println("Product not found.");
        }


        ((InMemoryDatabase) database).printAllProducts();
    }
}
