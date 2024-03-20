package oop;

public class Compte {
    private int ncomplte;
    private String name;
    private double solde;

    public int getNcomplte() {
        return this.ncomplte;
    }

    public void setNcomplte(int ncomplte) {
        this.ncomplte = ncomplte;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte() {

        solde = 0;
    }

    public Compte(int ncomplte, String name, double solde) {
        this.ncomplte = ncomplte;
        this.name = name;
        this.solde = solde;
    }

    public void deposer(float montant) {

        this.solde = montant;

    }

    public double getBalance() {

        return solde;

    }

    public void retirer(float r) {

        this.solde = solde - r;

    }

    public void ajouter_Interet(float taux) {
        this.solde =  solde  * 1 + taux;
    }

    public void displayCompte() {
        System.out.println(solde);
    }
}
