package org.example.exoHotel.classe;

public class Chambre {

    private int numero;
    private boolean statut;
    private int nombreLits;
    private double tarif;


    public Chambre(int numero,  int nombreLits, double tarif) {
        this.numero = numero;
        this.nombreLits = nombreLits;
        this.tarif = tarif;
        this.statut = true;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getNombreLits() {
        return nombreLits;
    }

    public void setNombreLits(int nombreLits) {
        this.nombreLits = nombreLits;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "numero=" + numero +
                ", statut=" + statut +
                ", nombreLits=" + nombreLits +
                ", tarif=" + tarif +
                '}';
    }
}
