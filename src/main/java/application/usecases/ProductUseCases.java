package application.usecases;
import application.domain.models.Product;
import application.domain.services.ProductService;
import java.util.List;
import java.util.Optional;

public class ProductUseCases {
    private final ProductService productService;

    public ProductUseCases(ProductService productService) {
        this.productService = productService;
    }

    public Product saveProduct(Product product) {
        return productService.save(product);
    }

    public Optional<Product> findProductById(String id) {
        return productService.findById(id);
    }

    public List<Product> findAllProducts() {
        return productService.findAll();
    }
    
}
