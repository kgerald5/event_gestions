package tg.esig.event_gestion.component;

import org.springframework.stereotype.Component;
import tg.esig.event_gestion.dao.EvenementRepository;
import tg.esig.event_gestion.dao.UtilisateurRepository;
import tg.esig.event_gestion.model.Evenement;
import tg.esig.event_gestion.model.Utilisateur;

import java.util.List;
import java.util.Optional;

@Component
public class EvenementComponent {
    private final EvenementRepository evenementRepository;

    public EvenementComponent(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }
    public Evenement ajouterEvenement(Evenement evenement){
        Evenement evenementSave= evenementRepository.save(evenement);
        return evenementSave;
    }

    public List<Evenement> afficheEvent() {
        List<Evenement> evenements = evenementRepository.findAll();
        return evenements;
    }


}
