package it.devlecce.Springwebgestioneprodotti.persistenza;

import it.devlecce.Springwebgestioneprodotti.Model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProdottoRepository extends JpaRepository<Prodotto,Long> {
    List<Prodotto> findByDatadiscadenzaBetween(Date data, Date dataa);
    List <Prodotto> findByDatadiacquistoBetween(Date datada, Date dataa);
}
