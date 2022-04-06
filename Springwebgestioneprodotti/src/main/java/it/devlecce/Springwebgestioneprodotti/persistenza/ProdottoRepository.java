package it.devlecce.Springwebgestioneprodotti.persistenza;

import it.devlecce.Springwebgestioneprodotti.Model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdottoRepository extends JpaRepository<Prodotto,Long> {
}
