package it.devlecce.Springwebgestioneprodotti.avviso;

public class ProdottoNonTrovato extends RuntimeException {
    public ProdottoNonTrovato(Long id){
        super("Prodotto non trovato "+id);
    }

}
