package it.devlecce.Springwebgestioneprodotti.controller;

import it.devlecce.Springwebgestioneprodotti.Model.Prodotto;
import it.devlecce.Springwebgestioneprodotti.persistenza.ProdottoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdottoRestController {

    private static Logger logger = LoggerFactory.getLogger(ProdottoRestController.class);

    public ProdottoRepository repository;

    ProdottoRestController(ProdottoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/prodotto")
    public List<Prodotto> leggiTuttiIProdotti() {
        logger.info("Prendo tutti i prodotti");
        return repository.findAll();
    }
}
