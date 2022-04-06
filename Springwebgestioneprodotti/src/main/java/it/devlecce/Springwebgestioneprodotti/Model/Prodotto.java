package it.devlecce.Springwebgestioneprodotti.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Prodotto {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Float prezzo, quantità;
    private Date datadiscadenza;
    private Date datadiacquisto;
    private float ranking;

    public Prodotto(String nome, Float prezzo, Float quantità, Date datadiscadenza, Date datadiacquisto, float ranking) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantità = quantità;
        this.datadiscadenza = datadiscadenza;
        this.datadiacquisto = datadiacquisto;
        this.ranking = ranking;
    }

    public Prodotto() {
    }

    public Prodotto(String nome, Float prezzo, Date datadiscadenza) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.datadiscadenza = datadiscadenza;
    }

    public Prodotto(Long id, String nome, Float prezzo, Date datadiscadenza) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.datadiscadenza = datadiscadenza;
    }

    public Prodotto(String nome, Float prezzo, Float quantità, Date datadiacquisto) {

        this.nome = nome;
        this.prezzo = prezzo;
        this.quantità = quantità;
        this.datadiacquisto = datadiacquisto;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }

    public Float getQuantità() {
        return quantità;
    }

    public void setQuantità(Float quantità) {
        this.quantità = quantità;
    }

    public Date getDatadiscadenza() {
        return datadiscadenza;
    }

    public void setDatadiscadenza(Date datadiscadenza) {
        this.datadiscadenza = datadiscadenza;
    }

    public Date getDatadiacquisto() {
        return datadiacquisto;
    }

    public void setDatadiacquisto(Date datadiacquisto) {
        this.datadiacquisto = datadiacquisto;
    }

    public float getRanking() {
        return ranking;
    }

    public void setRanking(float ranking) {
        this.ranking = ranking;
    }
}

