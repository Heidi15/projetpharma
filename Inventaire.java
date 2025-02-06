import java.util.*;
import java.io.Serializable;

public class Inventaire {
    private List<Produit> produits;

    public Inventaire() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }
}
