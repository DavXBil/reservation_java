package bo;

public abstract class Logement {

    public Logement(String adresse, double prixParNuit, int capaciteMax) {
        this.adresse = adresse;
        this.prixParNuit = prixParNuit;
        this.capaciteMax = capaciteMax;
    }

    protected Boolean estReserve = false;
    protected String adresse;
    protected double prixParNuit;
    protected int capaciteMax;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getPrixParNuit() {
        return prixParNuit;
    }

    public void setPrixParNuit(double prixParNuit) {
        this.prixParNuit = prixParNuit;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }
    public Boolean getEstReserve() {
        return estReserve;
    }

    public void setEstReserve(Boolean estReserve) {
        this.estReserve = estReserve;
    }

}
