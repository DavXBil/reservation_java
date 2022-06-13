package dao;

import bo.Maison;

import java.util.ArrayList;
import java.util.List;

public class MaisonDao {

    private List<Maison> maisons = new ArrayList<>();

    public void ajouter(Maison maison) {
        maisons.add(maison);
    }

    public void supprimer(Maison maison) {
        maisons.remove(maison);
    }

    public List<Maison> lister() {
        return maisons;
    }
}
