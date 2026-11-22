
package com.cooplogistics.ordercoop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cooperative", schema = "public")
public class Cooperative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 150)
    private String nom;

    @Column(name = "ice", length = 30, unique = true)
    private String ice;

    @Column(name = "adresse_siege", columnDefinition = "TEXT")
    private String adresseSiege;

    @Column(name = "ville", length = 100)
    private String ville;

    @Column(name = "telephone", length = 30)
    private String telephone;

    @Column(name = "statut", length = 30)
    private String statut;

    public Cooperative() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getAdresseSiege() {
        return adresseSiege;
    }

    public void setAdresseSiege(String adresseSiege) {
        this.adresseSiege = adresseSiege;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    // Générer les getters et setters avec IntelliJ
}
