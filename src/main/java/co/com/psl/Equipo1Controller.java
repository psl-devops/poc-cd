package co.com.psl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Equipo1Controller {
    @RequestMapping("/1")
    public String equipo1() {
        return "Esteban Echavarria ,  Julian Sanchez ,  Stiven Ramirez ,  Camilo Suaza ,  Sebastian Ospina ";
    }
}
