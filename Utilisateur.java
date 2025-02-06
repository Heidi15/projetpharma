abstract class Utilisateur {
    protected String nom;
    protected String role;

    public Utilisateur(String nom, String role) {
        this.nom = nom;
        this.role = role;
    }

    public abstract void afficherInfo();
}
