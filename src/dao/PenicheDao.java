package dao;

import bo.Peniche;

import java.util.ArrayList;
import java.util.List;

public class PenicheDao {

        private List<Peniche> peniches = new ArrayList<>();

        public void ajouter(Peniche peniche) {
            peniches.add(peniche);
        }

        public void supprimer(Peniche peniche) {
            peniches.remove(peniche);
        }

        public List<Peniche> lister() {
            return peniches;
        }
}
