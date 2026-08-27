package application.domain.services;
import application.domain.models.Seller;
import application.domain.ports.SellerRepository;

import java.util.List;
import java.util.Optional;

public class SellerService {
    private final SellerRepository sellerRepository;

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public Seller save(Seller seller) {
        return sellerRepository.save(seller);
    }

    public Optional<Seller> findById(String id) {
        return sellerRepository.findById(id);
    }

    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }

    public void deleteById(String id) {
        sellerRepository.deleteById(id);
    }
}
