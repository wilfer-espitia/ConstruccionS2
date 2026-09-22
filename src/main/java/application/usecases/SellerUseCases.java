package application.usecases;
import application.domain.models.Seller;
import application.domain.services.SellerService;
import java.util.List;
import java.util.Optional;

public class SellerUseCases {
    private final SellerService sellerService;

    public SellerUseCases(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    public Seller saveSeller(Seller seller) {
        return sellerService.save(seller);
    }

    public Optional<Seller> findSellerById(String id) {
        return sellerService.findById(id);
    }

    public List<Seller> findAllSellers() {
        return sellerService.findAll();
    }

    public void deleteSeller(String id) {
        sellerService.deleteById(id);
    }
}