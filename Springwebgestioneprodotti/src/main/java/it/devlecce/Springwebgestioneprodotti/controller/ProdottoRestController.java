package it.devlecce.Springwebgestioneprodotti.controller;

import it.devlecce.Springwebgestioneprodotti.Model.Prodotto;
import it.devlecce.Springwebgestioneprodotti.avviso.ProdottoNonTrovato;
import it.devlecce.Springwebgestioneprodotti.persistenza.ProdottoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/prodotto/{id}") // puoi mettere marco o utente o quello che vuoi
    public Prodotto trovatoProdottoConID(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ProdottoNonTrovato(id));
    }

    @PostMapping("/prodotto")   //prendiamo info dal body

    public Prodotto inserisciUnNuovoProdotto(@RequestBody Prodotto nuovoProdotto) {
        return repository.save(nuovoProdotto);
    }

    @DeleteMapping("/prodotto/{id}")
    void eleminaProdotto(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/prodotto")

    public Prodotto aggiornaDatiProdotto(@RequestBody Prodotto utente) {
        return repository.save(utente);
    }


    @GetMapping("prodotto/datascadenza")
    public List<Prodotto> ricercaProdottoDataScadenza(
            @RequestParam(name = "datada") @DateTimeFormat(pattern = "dd-MM-yyyy")

                    Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")

                    Date dataa
    ) {
        return repository.findByDatadiscadenzaBetween(datada, dataa);
    }

    @GetMapping("/prodotto/datadiacquisto")
    public  List<Prodotto> ricercaUtenteConDataDiRegistrazione (
            @RequestParam(name="datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date datada,
            @RequestParam(name="dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")

                    Date dataa
    ){
        return  repository.findByDatadiacquistoBetween(datada, dataa);
    }
}