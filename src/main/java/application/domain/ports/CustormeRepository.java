package application.domain.ports;

import application.domain.models.Custorme;
import java.util.List;
import java.util.Optional;

public interface CustormeRepository {

    Custorme save(Custorme custorme);

    Optional<Custorme> findById(String id);

    List<Custorme> findAll();

    void deleteById(String id);
    
}
