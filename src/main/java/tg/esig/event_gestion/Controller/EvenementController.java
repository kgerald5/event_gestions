package tg.esig.event_gestion.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tg.esig.event_gestion.component.EvenementComponent;
import tg.esig.event_gestion.dao.EvenementRepository;
import tg.esig.event_gestion.model.Evenement;
import tg.esig.event_gestion.model.Utilisateur;

import java.util.List;

@Controller
public class EvenementController {
    private EvenementComponent evenementComponent;

    public EvenementController(EvenementComponent evenementComponent){
        this.evenementComponent = evenementComponent;
    }
    @GetMapping("/getEvenement")
    public String getEvenement(Model model){
        List<Evenement> evenements = evenementComponent.afficheEvent();
        model.addAttribute("listEvenement", evenements);
        return "evenement";

    }

    @PostMapping("/insertEvenement")
    public String insertUtilisateur(String eventname, String author, String eventdate, String eventplace, RedirectAttributes redirectAttributes) {
        if (eventname.isEmpty() || author.isEmpty() || eventdate.isEmpty() || eventplace.isEmpty()) {
            redirectAttributes.addFlashAttribute("save_error", "Echec saisie");
            return "redirect:/getEvenement";

        } else {
            Evenement evenement = new Evenement();
            evenement.setEventname(eventname);
            evenement.setAuthor(author);
            evenement.setEventdate(eventdate);
            evenement.setEventplace(eventplace);
            Evenement evenementSave = evenementComponent.ajouterEvenement(evenement);
            redirectAttributes.addFlashAttribute("save_success", "Saisie validée avec succès");
            return "redirect:/getEvenement";
        }

    }
}
