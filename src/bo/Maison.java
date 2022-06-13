package bo;

public class Maison extends Logement {

    boolean possedeJardin;

    public Maison(String adresse, double prixParNuit, int capaciteMax, boolean possedeJardin) {
        super(adresse, prixParNuit, capaciteMax);
        this.possedeJardin = possedeJardin;
    }

    public boolean isPossedeJardin() {
        return possedeJardin;
    }

    public void setPossedeJardin(boolean possedeJardin) {
        this.possedeJardin = possedeJardin;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("bo.Appartement{");
        sb.append("estReserve=").append(estReserve);
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", prixParNuit=").append(prixParNuit);
        sb.append(", capaciteMax=").append(capaciteMax);
        sb.append(", possedeJardin='").append(possedeJardin).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
