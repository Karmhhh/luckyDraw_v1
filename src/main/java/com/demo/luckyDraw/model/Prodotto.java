package com.demo.luckyDraw.model;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "prodotto")
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID prodottoId;

    @Column(nullable = false)
    private String nome;

    private String descrizione;

    @Column(nullable = false)
    private double prezzoSorteggio;

    @Column(nullable = false)
    private int numeroMassimo = 90;  // Max 90 numeri

    private UUID vincitoreId;

    // Getters and Setters
    public UUID getProdottoId() {
        return prodottoId;
    }

    public void setProdottoId(UUID prodottoId) {
        this.prodottoId = prodottoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzoSorteggio() {
        return prezzoSorteggio;
    }

    public void setPrezzoSorteggio(double prezzoSorteggio) {
        this.prezzoSorteggio = prezzoSorteggio;
    }

    public int getNumeroMassimo() {
        return numeroMassimo;
    }

    public void setNumeroMassimo(int numeroMassimo) {
        this.numeroMassimo = numeroMassimo;
    }

    public UUID getVincitoreId() {
        return vincitoreId;
    }

    public void setVincitoreId(UUID vincitoreId) {
        this.vincitoreId = vincitoreId;
    }
}
