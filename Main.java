import java.util.*;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creation d'un scanner pour lire les entées utilisateurs
        Inventaire inventaire = new Inventaire();// Création d'un inventaire pour stocker les produits

        System.out.print("Entrez le nom du produit : ");//demander le nom du produit
        String nom = scanner.nextLine();

        System.out.print("Entrez la catégorie du produit : ");//demander la catégorie du produit
        String categorie = scanner.nextLine();

        System.out.print("Entrez le prix du produit : ");//demander le prix
        double prix = scanner.nextDouble();

        System.out.print("Entrez la quantité du produit : ");//demander la quantité
        int quantite = scanner.nextInt();

        //creation d'un objet produit
        Produit produit = new Produit(nom, categorie, prix, quantite);
        //Ajout du produit dans l'inventaire
        produit.ajouterProduit(nom, categorie, prix, quantite);
        inventaire.ajouterProduit(produit);
    }
}