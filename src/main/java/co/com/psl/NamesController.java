package co.com.psl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NamesController {
    @RequestMapping("/team4")
    public String index() {
        return "Felipe Macias Herrera<br>Juan Jose Suarez<br>Juan Manuel Ciro<br>";
    }
}


