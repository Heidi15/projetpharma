import java.util.*;
import java.io.Serializable;

public class Produit implements Stockable, Serializable {
    private String nom;
    private String categorie;
    private double prix;
    private int quantite;

    public Produit(String nom, String categorie, double prix, int quantite) {
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Implémentation de la méthode d'ajout
    @Override
    public void ajouterProduit(String nom, String categorie, double prix, int quantite) {
        if (prix > 0 && quantite > 0) {
            // ajouter le produit à l'inventaire
            // ajouter à une liste de produits
            System.out.println("Produit ajouté : " + nom);
        } else {
            System.out.println("Erreur : Le prix et la quantité doivent être supérieurs à zéro.");
        }
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }
}
