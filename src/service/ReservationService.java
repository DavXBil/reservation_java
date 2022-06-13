package service;

import bo.Logement;
import dao.LogementDao;
import exception.AlreadyReservedBusinessException;
import exception.SurcapaciteBusinessException;


import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private LogementDao logementDao;

    public ReservationService(LogementDao logementDao) {
        setAppartementDao(logementDao);
    }

    public void reserver(Logement logement, int nombreDePersonne) throws AlreadyReservedBusinessException, SurcapaciteBusinessException {
        if (logement.getEstReserve()) {
            throw new AlreadyReservedBusinessException("L'appartement " + logement + " est déjà réservé");
        }
        if (nombreDePersonne > logement.getCapaciteMax()) {
            throw new SurcapaciteBusinessException("L'appartement " + logement + " n'as pas assez de place");
        }

        logement.setEstReserve(true);
    }

    public void liberer(Logement logement) {
        logement.setEstReserve(false);
    }


    public List<Logement> listerAppartementsDisponibles() {
        List<Logement> logementsDisponibles = new ArrayList<>();
        for (Logement logement : logementDao.lister()) {
            if (!logement.getEstReserve()) {
                logementsDisponibles.add(logement);
            }
        }
        return logementsDisponibles;
    }

    public List<Logement> listerAppartementsNonDisponibles() {
        List<Logement> logementsNonDisponibles = new ArrayList<Logement>();
        for (Logement appartement : logementDao.lister()) {
            if (appartement.getEstReserve()) {
                logementsNonDisponibles.add(appartement);
            }
        }
        return logementsNonDisponibles;
    }

    public void setAppartementDao(LogementDao appartementDao) {
        this.logementDao = appartementDao;
    }
}
