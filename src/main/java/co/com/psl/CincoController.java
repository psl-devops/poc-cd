package co.com.psl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CincoController {
    @RequestMapping("/5")
    public String index() {
        return "Integrantes Grupo 5: -Douglas Ardila  -Esteban Perez  -Andres Felipe Avendaño";
    }
}
