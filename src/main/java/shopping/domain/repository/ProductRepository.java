package shopping.domain.repository;

import shopping.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(Long id);

    List<Product> findAll();

    Product save(Product product);

    void removeById(long productId);
}
