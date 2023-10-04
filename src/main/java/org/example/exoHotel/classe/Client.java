package org.example.exoHotel.classe;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private static int nbreClient =0;

    public Client( String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.id = nbreClient++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getNbreClient() {
        return nbreClient;
    }

    public static void setNbreClient(int nbreClient) {
        Client.nbreClient = nbreClient;
    }

    @Override
    public String toString() {
        return "Client:" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                '.';
    }
}
