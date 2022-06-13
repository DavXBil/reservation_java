package bo;

public class Appartement extends Logement {

    String etage;

    public Appartement(String adresse, double prixParNuit, int capaciteMax, String etage) {
        super(adresse, prixParNuit, capaciteMax);
        this.etage = etage;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("bo.Appartement{");
        sb.append("estReserve=").append(estReserve);
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", prixParNuit=").append(prixParNuit);
        sb.append(", capaciteMax=").append(capaciteMax);
        sb.append(", etage='").append(etage).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
