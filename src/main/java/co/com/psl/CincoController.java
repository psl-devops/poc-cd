package co.com.psl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CincoController {
    @RequestMapping("/cinco")
    public String index() {
        return "Integrantes Grupo 5:\n -Douglas Ardila \n -Esteban Perez \n -Andres Felipe Avendaño";
    }
}
