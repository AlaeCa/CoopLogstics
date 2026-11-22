
package com.cooplogistics.ordercoop.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cooperative_id")
    private Cooperative cooperative;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adresse_origine_id")
    private Adresse adresseOrigine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adresse_destination_id")
    private Adresse adresseDestination;

    @Column(name = "reference", length = 80, unique = true)
    private String reference;

    @Column(name = "date_creation")
    private LocalDateTime dateCreation;

    @Column(name = "statut", length = 30)
    private String statut;

    @Column(name = "poids_total", precision = 12, scale = 3)
    private BigDecimal poidsTotal;

    @Column(name = "volume_total", precision = 12, scale = 3)
    private BigDecimal volumeTotal;

    @Column(name = "livraison_souhaitee")
    private LocalDateTime livraisonSouhaitee;

    public Commande() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLivraisonSouhaitee() {
        return livraisonSouhaitee;
    }

    public void setLivraisonSouhaitee(LocalDateTime livraisonSouhaitee) {
        this.livraisonSouhaitee = livraisonSouhaitee;
    }

    public BigDecimal getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(BigDecimal volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    public BigDecimal getPoidsTotal() {
        return poidsTotal;
    }

    public void setPoidsTotal(BigDecimal poidsTotal) {
        this.poidsTotal = poidsTotal;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Adresse getAdresseDestination() {
        return adresseDestination;
    }

    public void setAdresseDestination(Adresse adresseDestination) {
        this.adresseDestination = adresseDestination;
    }

    public Adresse getAdresseOrigine() {
        return adresseOrigine;
    }

    public void setAdresseOrigine(Adresse adresseOrigine) {
        this.adresseOrigine = adresseOrigine;
    }

    public Cooperative getCooperative() {
        return cooperative;
    }

    public void setCooperative(Cooperative cooperative) {
        this.cooperative = cooperative;
    }
// Générer les getters et setters
}
