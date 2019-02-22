package co.com.psl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class E7Controller {

    @RequestMapping("/E7")
    public String index() {
        return "Edwin Arley Rengifo Villa <br> Joshua Sanchez Alvarez <br> Camilo Villa Restrepo <br> Miguel Angel Ortiz Arboleda <br> Juan Pablo Zapata Raigoza";
    }

}