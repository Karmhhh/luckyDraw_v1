package com.demo.luckyDraw.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "numero_sorteggio")
public class NumeroSorteggio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID numeroId;

    @Column(nullable = false)
    private int numero;

    @Column(nullable = false)
    private UUID accountId;  // Utente che ha acquistato il numero

    @Column(nullable = false)
    private UUID prodottoId;  // Prodotto associato al sorteggio

    @Column(nullable = false)
    private LocalDateTime dataAcquisto;

    @Column(nullable = false)
    private double prezzoPagato;

    // Getters and Setters
    public UUID getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(UUID numeroId) {
        this.numeroId = numeroId;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public UUID getProdottoId() {
        return prodottoId;
    }

    public void setProdottoId(UUID prodottoId) {
        this.prodottoId = prodottoId;
    }

    public LocalDateTime getDataAcquisto() {
        return dataAcquisto;
    }

    public void setDataAcquisto(LocalDateTime dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public double getPrezzoPagato() {
        return prezzoPagato;
    }

    public void setPrezzoPagato(double prezzoPagato) {
        this.prezzoPagato = prezzoPagato;
    }
}

