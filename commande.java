import java.util.Date;
import java.util.*;
class Commande {
    private int id;
    private Utilisateur utilisateur;
    private Date date;  // Variable date déclarée ici

    public Commande(int id, Utilisateur utilisateur) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.date = new Date();  // Initialisation de la variable date
    }

    public void afficherDetailsCommande() {
        // Assurez-vous de faire référence à "date" et non à "dateCommande"
        System.out.println("Commande ID: " + id + ", Utilisateur: " + utilisateur.nom + ", Date: " + date);
    }
}