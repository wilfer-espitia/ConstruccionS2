package application.domain.ports;
import application.domain.models.Seller;

import java.util.List;
import java.util.Optional;

public interface SellerRepository {

    Seller save(Seller seller);

    Optional<Seller> findById(String id);

    List<Seller> findAll();

    void deleteById(String id);
    
}
