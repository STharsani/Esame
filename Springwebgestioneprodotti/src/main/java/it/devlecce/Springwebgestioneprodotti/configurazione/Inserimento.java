package it.devlecce.Springwebgestioneprodotti.configurazione;

import it.devlecce.Springwebgestioneprodotti.Model.Prodotto;
import it.devlecce.Springwebgestioneprodotti.persistenza.ProdottoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class Inserimento {

    private static Logger logger = LoggerFactory.getLogger(Inserimento.class);

    @Bean
    CommandLineRunner inserisciElementi(ProdottoRepository repository) {
        return args -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date datadiscadenza = dateFormat.parse("07-04-2022");
            Date datadiacquisto = dateFormat.parse("06-04-2022");


            Prodotto p1 = new Prodotto("Pane", 1f, 2f, datadiscadenza, datadiacquisto, 1f);

        logger.info(("nome: "+p1.getNome()+"prezzo: "+p1.getPrezzo()+"quantità: " "data di scadenza: "+p1.getDatadiscadenza()+);

            datadiscadenza = dateFormat.parse("23-04-2022");
            datadiacquisto = dateFormat.parse("12-04-2022");

            Prodotto p2 = new Prodotto("Yogurt", 2f, 4f, datadiscadenza, datadiacquisto, 5f);

            datadiscadenza = dateFormat.parse("29-07-2024");
            datadiacquisto = dateFormat.parse("10-07-2022");
            Prodotto p3 = new Prodotto("Biscotti", 3f, 7f, datadiscadenza, datadiacquisto, 3f);

            List<Prodotto> prodotti = new ArrayList<>();
            prodotti.add(p1);
            prodotti.add(p2);
            prodotti.add(p3);

            repository.saveAll(prodotti);  //CREATE ALL


        };
    }
}
