import java.util.*;
import java.io.Serializable;

public interface Stockable {
    void ajouterProduit(String nom, String categorie, double prix, int quantite);
}
