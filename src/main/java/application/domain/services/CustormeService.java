package application.domain.services;
import application.domain.models.Custorme;
import application.domain.ports.CustormeRepository;


import java.util.List;
import java.util.Optional;

public class CustormeService {
    private final CustormeRepository customerRepository;

    public CustormeService(CustormeRepository custormeRepository) {
        this.customerRepository = custormeRepository;
    }

    public Custorme save(Custorme custorme) {
        return customerRepository.save(custorme);
    }

    public Optional<Custorme> findById(String id) {
        return customerRepository.findById(id);
    }

    public List<Custorme> findAll() {
        return customerRepository.findAll();
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);
    

    }
}
