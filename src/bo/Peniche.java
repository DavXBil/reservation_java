package bo;

public class Peniche extends Logement{

    double longueur;

    public Peniche(String adresse, double prixParNuit, int capaciteMax, double longueur) {
        super(adresse, prixParNuit, capaciteMax);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("bo.Appartement{");
        sb.append("estReserve=").append(estReserve);
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", prixParNuit=").append(prixParNuit);
        sb.append(", capaciteMax=").append(capaciteMax);
        sb.append(", longueur='").append(longueur).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
