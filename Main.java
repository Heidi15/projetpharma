import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Création des utilisateurs (pharmacien)
        Pharmacien pharmacien = new Pharmacien("Dr. Dupont");

        // Création des catégories et produits
        Categorie medicaments = new Categorie("Médicaments");
        medicaments.ajouterProduit(new Produit(1, "Amoxicilline", 5.99, 120, "Médicaments"));
        medicaments.ajouterProduit(new Produit(2, "Azithromycine", 7.49, 50, "Médicaments"));
        medicaments.ajouterProduit(new Produit(3, "Ciprofloxacine", 8.29, 75, "Médicaments"));

        Categorie cosmétiques = new Categorie("Cosmétiques");
        cosmétiques.ajouterProduit(new Produit(7, "Crème hydratante", 14.99, 80, "Cosmétiques"));
        cosmétiques.ajouterProduit(new Produit(8, "Gel nettoyant visage", 9.49, 150, "Cosmétiques"));

        Categorie parapharmacie = new Categorie("Parapharmacie");
        parapharmacie.ajouterProduit(new Produit(10, "Brosse à dents électrique", 39.99, 15, "Parapharmacie"));
        parapharmacie.ajouterProduit(new Produit(11, "Dentifrice blancheur", 3.99, 250, "Parapharmacie"));

        // Liste de tous les produits
        List<Produit> tousLesProduits = new ArrayList<>();
        tousLesProduits.addAll(medicaments.getProduits());
        tousLesProduits.addAll(cosmétiques.getProduits());
        tousLesProduits.addAll(parapharmacie.getProduits());

        // Pharmacien consulte les produits
        pharmacien.consulterProduits(tousLesProduits);

        // Création d'une commande
        Commande commande = new Commande(1, pharmacien);
        commande.afficherDetailsCommande();
    }
}