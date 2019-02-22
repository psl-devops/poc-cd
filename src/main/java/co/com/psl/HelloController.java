package co.com.psl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Andrés Gómez Vásquez<br>Santiago Ignacio Vanegas Pérez<br>Juan Esteban Henao<br>Santiago Garcés";
    }

}