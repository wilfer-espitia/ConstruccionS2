package application.usecases;
import application.domain.models.Custorme;
import application.domain.services.CustormeService;
import java.util.List;
import java.util.Optional;

public class CustormeUseCases {
    private final CustormeService custormeService;

    public CustormeUseCases(CustormeService custormeService) {
        this.custormeService = custormeService;
    }

    public Custorme saveCustorme(Custorme custorme) {
        return custormeService.save(custorme);
    }

    public Optional<Custorme> findCustormeById(String id) {
        return custormeService.findById(id);
    }

    public List<Custorme> findAllCustormes() {
        return custormeService.findAll();
    }

    public void deleteCustorme(String id) {
        custormeService.deleteById(id);
    }
}