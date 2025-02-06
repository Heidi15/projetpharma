import java.util.*;
import java.io.Serializable;

public abstract class Utilisateur {
    private String username;
    private String motDePasse;

    public abstract void afficherPermissions();
}
