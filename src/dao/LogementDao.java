package dao;

import bo.Appartement;
import bo.Logement;

import java.util.ArrayList;
import java.util.List;

public class LogementDao {

        private List<Logement> logements = new ArrayList<>();

        public void ajouter(Logement logement) {
            logements.add(logement);
        }

        public void supprimer(Logement logement) {
            logements.remove(logement);
        }

        public List<Logement> lister() {
            return logements;
        }
}
