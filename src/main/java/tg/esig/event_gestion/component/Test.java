package tg.esig.event_gestion.component;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import tg.esig.event_gestion.dao.EvenementRepository;
import tg.esig.event_gestion.dao.UtilisateurRepository;
import tg.esig.event_gestion.model.Evenement;
import tg.esig.event_gestion.model.Utilisateur;

import java.util.List;

@Component
public class Test {
    private final UtilisateurRepository utilisateurRepository;
    private final EvenementRepository evenementRepository;

    public Test(UtilisateurRepository utilisateurRepository, EvenementRepository evenementRepository) {
        this.utilisateurRepository = utilisateurRepository;
        this.evenementRepository = evenementRepository;
    }

@PostConstruct
    public void InsetsUtilisateur() {
//       Utilisateur utilisateur=new Utilisateur();
    //       utilisateur.setNom("ChampagnePapi");
    //      utilisateur.setPrenom("Drake");
    //     utilisateur.setAge(32);
    //      utilisateur.setLocation("Texas");
       //  Utilisateur utilisateurSave=utilisateurRepository.save(utilisateur);
    //       System.out.println("Utilisateur inserer:"+utilisateurSave);
    Utilisateur utilisateur = utilisateurRepository.findNom("ChampagnePapi");

    //utilisateur.setAge(32);

   // Utilisateur utilisateur1 = utilisateurRepository.save(utilisateur);

    System.out.println("utilisateur afficher: "+utilisateur);



}
//@PostConstruct
    public void InsetsEvenement(){

        Evenement evenement = new Evenement();
        evenement.setEventname("Fun Party");
        evenement.setAuthor("Blaise Lucky");
        evenement.setEventdate("31/12/2023");
        evenement.setEventplace("Marcelo Beach");
        Evenement evenementSave=evenementRepository.save(evenement);
        System.out.println("Evenement inserer:"+evenementSave);
}
    public String afficheInfo(){
        List<Utilisateur> utilisateurs=utilisateurRepository.findAll();
        return utilisateurs.toString();
    }

    public List<Utilisateur> getInfo(){
        List<Utilisateur> utilisateurs=utilisateurRepository.findAll();
        return utilisateurs;
    }

}
