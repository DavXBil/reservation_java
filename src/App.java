import bo.Appartement;
import bo.Logement;
import bo.Maison;
import bo.Peniche;
import dao.LogementDao;
import exception.AlreadyReservedBusinessException;
import exception.SurcapaciteBusinessException;
import service.ReservationService;

import java.util.List;

public class App {

    static LogementDao logementDao;
    static ReservationService reservationService;

    public static void main(String[] args) throws AlreadyReservedBusinessException, SurcapaciteBusinessException {
        logementDao = new LogementDao();
        reservationService = new ReservationService(logementDao);

        initData();

        List<Logement> logements = logementDao.lister();
        System.out.println(logements);

        reservationService.reserver(logements.get(0), 1);

        try {
            reservationService.reserver(logements.get(0), 1);
        } catch (AlreadyReservedBusinessException e) {
            System.out.println("bo.Appartement déjà réservé, test OK");
        }

        reservationService.liberer(logements.get(0));
        reservationService.reserver(logements.get(0), 1);

        System.out.printf("appartement disponibles: %s\n", reservationService.listerAppartementsDisponibles());
        System.out.printf("appartement non disponibles: %s\n", reservationService.listerAppartementsNonDisponibles());

        try {
            reservationService.reserver(logements.get(1), logements.get(1).getCapaciteMax() + 1);
        } catch (SurcapaciteBusinessException e) {
            System.out.println("bo.Appartement en surcapacité, test OK");
        }
    }

    private static void initData() {
        logementDao.ajouter(new Appartement("1 rue", 25, 4, "RDC"));
        logementDao.ajouter(new Maison("2 rue", 15, 2, true));
        logementDao.ajouter(new Appartement("3 rue", 115, 8, "Toît"));
    }
}
