
package com.cooplogistics.ordercoop.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "colis")
public class Colis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @Column(name = "code_suivi", length = 80, unique = true)
    private String codeSuivi;

    @Column(name = "designation", length = 255)
    private String designation;

    @Column(name = "poids", precision = 12, scale = 3)
    private BigDecimal poids;

    @Column(name = "volume", precision = 12, scale = 3)
    private BigDecimal volume;

    @Column(name = "fragile")
    private Boolean fragile;

    @Column(name = "perissable")
    private Boolean perissable;

    @Column(name = "type_produit", length = 100)
    private String typeProduit;

    public Colis() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(String typeProduit) {
        this.typeProduit = typeProduit;
    }

    public Boolean getPerissable() {
        return perissable;
    }

    public void setPerissable(Boolean perissable) {
        this.perissable = perissable;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getPoids() {
        return poids;
    }

    public void setPoids(BigDecimal poids) {
        this.poids = poids;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCodeSuivi() {
        return codeSuivi;
    }

    public void setCodeSuivi(String codeSuivi) {
        this.codeSuivi = codeSuivi;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
// Générer les getters et setters
}
