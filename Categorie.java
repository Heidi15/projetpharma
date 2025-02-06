import java.util.*;
class Categorie {
    private String nom;
    private List<Produit> produits;

    public Categorie(String nom) {
        this.nom = nom;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public String getNom() {
        return nom;
    }
}
