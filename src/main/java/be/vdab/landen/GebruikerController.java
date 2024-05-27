package be.vdab.landen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GebruikerController {
    GebruikerController() {
        System.out.println("Besturingssysteem: " + System.getProperty("os.name"));
        System.out.println("Gebruikersnaam: " + System.getProperty("user.name"));
        System.out.println("Home directory van de gebruiker: " + System.getProperty("user.home"));
    }
}
