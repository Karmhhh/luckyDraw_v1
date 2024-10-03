package com.demo.luckyDraw.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "spedizione")
public class Spedizione {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID spedizioneId;

    @Column(nullable = false)
    private UUID prodottoId;

    @Column(nullable = false)
    private UUID vincitoreId;

    @Column(nullable = false)
    private String indirizzoSpedizione;

    private LocalDateTime dataSpedizione;
    
    private String statoSpedizione = "In attesa";

    // Getters and Setters
    public UUID getSpedizioneId() {
        return spedizioneId;
    }

    public void setSpedizioneId(UUID spedizioneId) {
        this.spedizioneId = spedizioneId;
    }

    public UUID getProdottoId() {
        return prodottoId;
    }

    public void setProdottoId(UUID prodottoId) {
        this.prodottoId = prodottoId;
    }

    public UUID getVincitoreId() {
        return vincitoreId;
    }

    public void setVincitoreId(UUID vincitoreId) {
        this.vincitoreId = vincitoreId;
    }

    public String getIndirizzoSpedizione() {
        return indirizzoSpedizione;
    }

    public void setIndirizzoSpedizione(String indirizzoSpedizione) {
        this.indirizzoSpedizione = indirizzoSpedizione;
    }

    public LocalDateTime getDataSpedizione() {
        return dataSpedizione;
    }

    public void setDataSpedizione(LocalDateTime dataSpedizione) {
        this.dataSpedizione = dataSpedizione;
    }

    public String getStatoSpedizione() {
        return statoSpedizione;
    }

    public void setStatoSpedizione(String statoSpedizione) {
        this.statoSpedizione = statoSpedizione;
    }
}
