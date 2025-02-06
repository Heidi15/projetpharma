import java.util.*;
class Pharmacien extends Utilisateur {
    public Pharmacien(String nom) {
        super(nom, "Pharmacien");
    }

    @Override
    public void afficherInfo() {
        System.out.println("Pharmacien : " + nom);
    }

    public void consulterProduits(List<Produit> produits) {
        // Tri des produits par nom
        Collections.sort(produits, Comparator.comparing(Produit::getNom));

        System.out.println("Liste des produits disponibles : ");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }
}