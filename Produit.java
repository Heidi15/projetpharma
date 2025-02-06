import java.util.*;
class Produit implements Stockable, Serializable {
    private int id;
    private String nom;
    private double prix;
    private int quantiteStock;
    private String categorie;

    public Produit(int id, String nom, double prix, int quantiteStock, String categorie) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantiteStock = quantiteStock;
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public int getQuantiteStock() {
        return quantiteStock;
    }

    // Implémentation de la méthode 'serializable()' de l'interface Serializable
    @Override
    public String serializable() {
        return "Produit{id=" + id + ", nom='" + nom + "', prix=" + prix + ", quantiteStock=" + quantiteStock + ", categorie='" + categorie + "'}";
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prix: " + prix + "€, Quantité: " + quantiteStock + ", Catégorie: " + categorie;
    }
}
