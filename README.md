# Esame

1.Creazione di un repository su Github;
2. Creazione del progetto su spring boot;

A. Package model: --> class Prodotto: utilizzato per creare entità del prodotto con i seguenti paramentri:
ID, NOME, PREZZO, QUANTITà, DATA DI SCADENZA, DATA DI ACQUISTO E RANKING. 
Essendo che li abbiamo creati private ho generato dei get e set per renderli pubblici.
Infine abbiamo creato dei costruttori Prodotto.
    
B. Package configuraizone --> class Inserimento: dove abbiamo caricato gli oggetti nel database h2.

C. Package controller --> class ProdottoRestController dove si è creato l'archittetura Rest

D. Package persistenza --> interface ProdottoRepository definisce il query creato in ProdottoRestController

4. Postman per la verifica delle API :

![figure](Springwebgestioneprodotti/Immagini%20°-°/Tutti%20i%20prodotti.png "http://localhost:8080/prodotto")
![figure](Springwebgestioneprodotti/Immagini%20°-°/by%20id.png "http://localhost:8080/prodotto/1")
![figure](Springwebgestioneprodotti/Immagini%20°-°/Nuovo%20prodotto.png "http://localhost:8080/prodotto")
![figure](Springwebgestioneprodotti/Immagini%20°-°/delete%20giusto.png "http://localhost:8080/prodotto/4")
![figure](Springwebgestioneprodotti/Immagini%20°-°/Aggiorna.png "http://localhost:8080/prodotto")
![figure](Springwebgestioneprodotti/Immagini%20°-°/Datadiscadenza.png "http://localhost:8080/prodotto/datascadenza?datada=27-07-2024&dataa=29-07-2024")
![figure](Springwebgestioneprodotti/Immagini%20°-°/datadiacquisto.png "http://localhost:8080/prodotto/datadiacquisto?datada=08-07-2022&dataa=10-07-2022")
![figure](Springwebgestioneprodotti/Immagini%20°-°/ranking.png "http://localhost:8080/prodotto/ranking?min=1&max=5")
![figure](Springwebgestioneprodotti/Immagini%20°-°/ranking%20min.png "http://localhost:8080/prodotto/rankingmin?min=0.0")
![figure](Springwebgestioneprodotti/Immagini%20°-°/caricafile.png "http://localhost:8080/caricafile")
![figure](Springwebgestioneprodotti/Immagini%20°-°/N.png "http://localhost:8080/prodotto/nome?nome=Biscotti")
![figure](Springwebgestioneprodotti/Immagini%20°-°/Prezzo.png "http://localhost:8080/prodotto/prezzo?max=3")
![figure](Springwebgestioneprodotti/Immagini%20°-°/Quantità.png "http://localhost:8080/prodotto/quantità?max=7")

5. Spring Security con inMemoryAuthentication
